# project-notebook
~~~
我们都是阴沟里的虫子，但总还是得有人仰望星空 
~~~



> tcp 协议通讯原理:TCP（Transmission Control Protocol）协议是一种可靠的面向连接的协议。在进行通信时，TCP协议将数据分割成一个个数据段，通过IP网络传输到对方计算机，然后重新组装成数据流以便接收方使用。

> TCP协议在通讯时，有一个可靠的确认机制。数据发送方在发送数据的同时，会用一个序号（sequence number）标记这个数据段。接收方接收到数据后，会向发送方发送确认号（acknowledgment number）表示已收到数据。发送方会在接收到确认号之后，再发送下一个数据段。

> 如果发送方未收到接收方的确认信息，它会尝试重新发送该数据段，直到接收到确认信息为止。此外，TCP协议还提供了流量控制与拥塞控制，确保网络资源的合理使用，避免过度拥塞。

> 总的来说，TCP协议是基于可靠的、面向连接的、点对点的传输方式，通讯过程中数据分段、传输，接收方需要发回确认信息，以确保传输的可靠性和准确性。

## http协议
> HTTP（Hypertext Transfer Protocol，超文本传输协议）是一种应用层（application-layer）协议，用于在Web浏览器和Web服务器之间传输超文本（hypertext）文档及其他资源。

> HTTP通信过程中，客户端发送HTTP请求报文给服务器，请求报文中包含了请求的方法、URI（Uniform Resource Identifier）、HTTP协议版本、请求头等信息；服务器收到请求后，解析请求报文，进行相应的处理并生成HTTP响应报文，响应报文中包含了协议版本、状态码、响应头等信息和响应实体。然后将响应报文发送给客户端。

> HTTP协议是无状态的协议，即HTTP服务器在处理完客户端的请求后，不保留任何关于该请求的信息。因此，每次客户端和服务器的请求与响应完成后都会断开连接，每次通信都需要重新建立连接，这就造成了HTTP协议的效率较低。为了解决这个问题，HTTP协议引入了Cookie和Session机制，记录用户的登录状态等信息，从而实现了状态的保持。

> 总的来说，HTTP协议是一种基于请求和响应的无状态协议，通信过程中客户端与服务器建立连接，发送请求报文，接收响应报文，并在完成请求响应后断开连接。通过使用Cookie和Session机制，实现了状态的保持，提高了通信效率。
