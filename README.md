# آزمایش سوم: BDD
## پاسخ پرسش‌ها
هنگام اجرای Scenario Outline ها خطای Undefined Step ایجاد می‌شود. علت این مسئله منفی بودن برخی اعداد ورودی و منطبق نبودن با الگوی regex موجود است. برای حل این مشکل الگوی regex مورد نیاز برای اعداد منفی نیز به پروژه اضافه می‌‎گردد.

## گزارش و توضیح مراحل آزمایش
در ابتدا، همانطور که در مثال موجود در دستور کار گفته شده است، باید یک پروژه بر مبنای maven ساخته شود. در شکل زیر این کار انجام شده است و وابستگی‌های لازم (dependencies) نظیر cucumber به پروژه اضافه شده است.

![0](https://github.com/soleyman79/SE_Lab3/assets/59166192/d0b1e59b-4ecb-4356-a6f4-7c49d3320887)

در تصویر زیر، با استفاده از دستور git init، پروژه در گیت initialize شده است و در ادامه، دستور git status این موضوع را تایید می‌کند.

![1](https://github.com/soleyman79/SE_Lab3/assets/59166192/206e5cb8-2637-480b-ac98-afd40902121f)

در تصویر زیر، نمونه‌ای از فرایند stage کردن فایل‌های تغییر یافته و زدن commit نشان داده شده است:

![2](https://github.com/soleyman79/SE_Lab3/assets/59166192/63378497-2b12-47c7-9265-52d0d7deed6d)

در تصویر زیر، سرور ریموت به پروژه محلی وصل شده است و روی شاخه main، تغییرات پوش شده اند:

![3](https://github.com/soleyman79/SE_Lab3/assets/59166192/4db14b87-c19a-42c1-b1b3-95949fdc1935)

در ادامه، یک کلاس RunnerTest ایجاد شده است تا قابلیت اجرای تست‌ها را داشته باشد:

![4](https://github.com/soleyman79/SE_Lab3/assets/59166192/711f85dd-eaec-471b-9728-53718326daf1)

در قدم بعد، گزینه CucumberOptions اضافه شده است و دایرکتوری features هم به عنوان آرگومان features به آن پاس داده شده است تا Cucumber بتواند این دایرکتوری و محتواهای داخلش را بشناسد و به آنها دسترسی داشته باشد:

![5](https://github.com/soleyman79/SE_Lab3/assets/59166192/dea9c347-5095-4f9c-be5b-3ba7ec4b27ff)

در ادامه، مطابق با نمونه قرار داده شده در مثال دستور کار، سناریوها با کلیدواژه‌های Given, When و Then نوشته شده‌اند و یک جدول examples برای آزمایش حالات مختلف قرار داده شده‌است. دقت شود که نام ستون‌های این جدول، باید با کلمات آورده شده در سناریو یکسان باشد:

![6](https://github.com/soleyman79/SE_Lab3/assets/59166192/2ade3eed-b494-40d9-a855-f9242a24a1ff)








