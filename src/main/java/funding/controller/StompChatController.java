package funding.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import funding.dto.ChatMessageDTO;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class StompChatController {

	private final SimpMessagingTemplate template; // 특정 Broker로 메세지를 전달

	// Client가 SEND할 수 있는 경로
	// stompConfig에서 설정한 applicationDestinationPrefixes와 @MessageMapping 경로가 병합됨
	// "/pub/chat/enter"
	@MessageMapping(value = "/chat/enter")
	public void enter(ChatMessageDTO message) {
		message.setMessage(message.getReceiverId() + "님이 채팅방에 참여하였습니다.");
		template.convertAndSend("/sub/chat/room/" + message.getChatroomId(), message);
	}

	@MessageMapping(value = "/chat/message")
	public void message(ChatMessageDTO message) {
		template.convertAndSend("/sub/chat/room/" + message.getChatroomId(), message);
	}
}