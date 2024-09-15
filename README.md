# AGRICULTURE MARKET

## Lưu ý: 
### Khi làm việc với các file lưu trữ message
- Để không làm mất định dạng trong quá trình build, pull, push ... thì các file này cần được mã hóa UTF-8, vì kiểu mã 
hóa này hỗ trợ đầy đủ các ký tự như tiếng Việt... messages.properties text eol=lf working-tree-encoding=UTF-8
- Cấu hình với git, trong .gitattributes:
  messages_vi.properties text eol=lf working-tree-encoding=UTF-8 (riêng 1 file)
  *.properties text eol=lf working-tree-encoding=UTF-8 (tất cả file.properties)
- Cấu hình maven để sử dụng UTF-8 trong quá trình build:
    ````XML
    <properties>
        ....
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
    </properties>