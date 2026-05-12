# Bài 4: Kiểm thử đa hệ điều hành với Matrix Strategy

## Mục tiêu
- Sử dụng **Matrix Strategy** trong GitHub Actions để kiểm thử ứng dụng trên nhiều hệ điều hành: Ubuntu, Windows, và macOS.
- Xử lý vấn đề tương thích đường dẫn tệp tin giữa các hệ điều hành khác nhau.

## Các bước thực hiện
1. **Khởi tạo dự án Maven**: Thiết lập cấu trúc thư mục tiêu chuẩn cho Java và cấu hình `pom.xml`.
2. **Thiết lập GitHub Actions Matrix**:
   - Tạo file `.github/workflows/matrix.yml`.
   - Cấu hình `strategy.matrix.os` để chạy trên `ubuntu-latest`, `windows-latest`, và `macos-latest`.
3. **Mô phỏng lỗi tương thích**:
   - Tạo `FileService` với phương thức ghép đường dẫn sử dụng dấu gạch chéo ngược (`\`) cứng của Windows.
   - Tạo Unit Test kỳ vọng đường dẫn sử dụng `File.separator`.
   - Quan sát lỗi khi chạy trên các hệ điều hành không phải Windows (Ubuntu/macOS).
4. **Refactor mã nguồn**:
   - Cập nhật `FileService` sử dụng `java.nio.file.Path` để tự động xử lý separator phù hợp với từng OS.
   - Đảm bảo Unit Test vượt qua trên mọi nền tảng.

## Cách chạy locally
```bash
./run.sh
```
Hoặc sử dụng Maven:
```bash
mvn test
```
