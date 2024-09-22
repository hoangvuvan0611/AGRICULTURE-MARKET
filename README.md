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
  

### Các role trong hệ thống và mô tả về vai trò của nó 
- ADMIN: 
  - Có quyền truy cập và quản lý toàn bộ hệ thống.
  - Quản lý người dùng, phân quyền, xem và chỉnh sửa tất cả dữ liệu.
  - Thực hiện các hành động như tạo, xóa, cập nhật
- MANAGER:
  - Quản lý các nhóm nhỏ hoặc các bộ phận cụ thể trong hệ thống
  - Có thể xem và quản lý dữ liệu liên quan đến nhóm hoặc dự án mà họ phụ trách
  - Thực hiện các hành động như phê duyệt, cập nhật thông tin, và quản lý nhân viên dưới quyền.
- EMPLOYEE: 
  - Nhân viên, có quyền hạn hạn chế hơn, chỉ có thể truy cập và thao tác với dữ liệu liên quan trực tiếp đến công việc cụ thể của họ.
  - Không thể thay đổi dữ liệu quan trọng hoặc thực hiện các hành động quản trị.
- SUPERVISOR:
  - Giám sát viên, có vai trò quản lý và giám sát hoạt động của nhân viên dưới quyền.
  - Có thể xem báo cáo, theo dõi hiệu suất và đưa ra các nhận xét, nhưng không có toàn quyền như ADMIN hoặc MANAGER.