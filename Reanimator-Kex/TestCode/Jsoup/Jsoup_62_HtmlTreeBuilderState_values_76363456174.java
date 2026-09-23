package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class HtmlTreeBuilderState_values_76363456174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53629;

    public HtmlTreeBuilderState_values_76363456174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53952 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53951 = ((Class) term53952).getDeclaredField((String) "Initial");
        ((Field) term53951).setAccessible(true);
        Object enum136 = ((Field) term53951).get((Object) null);
        Class<? extends Object> term54165 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54164 = ((Class) term54165).getDeclaredField((String) "BeforeHtml");
        ((Field) term54164).setAccessible(true);
        Object enum137 = ((Field) term54164).get((Object) null);
        Class<? extends Object> term54387 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54386 = ((Class) term54387).getDeclaredField((String) "BeforeHead");
        ((Field) term54386).setAccessible(true);
        Object enum138 = ((Field) term54386).get((Object) null);
        Class<? extends Object> term54609 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54608 = ((Class) term54609).getDeclaredField((String) "InHead");
        ((Field) term54608).setAccessible(true);
        Object enum139 = ((Field) term54608).get((Object) null);
        Class<? extends Object> term54819 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54818 = ((Class) term54819).getDeclaredField((String) "InHeadNoscript");
        ((Field) term54818).setAccessible(true);
        Object enum140 = ((Field) term54818).get((Object) null);
        Class<? extends Object> term55053 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55052 = ((Class) term55053).getDeclaredField((String) "AfterHead");
        ((Field) term55052).setAccessible(true);
        Object enum141 = ((Field) term55052).get((Object) null);
        Class<? extends Object> term55272 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55271 = ((Class) term55272).getDeclaredField((String) "InBody");
        ((Field) term55271).setAccessible(true);
        Object enum142 = ((Field) term55271).get((Object) null);
        Class<? extends Object> term55482 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55481 = ((Class) term55482).getDeclaredField((String) "Text");
        ((Field) term55481).setAccessible(true);
        Object enum143 = ((Field) term55481).get((Object) null);
        Class<? extends Object> term55686 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55685 = ((Class) term55686).getDeclaredField((String) "InTable");
        ((Field) term55685).setAccessible(true);
        Object enum144 = ((Field) term55685).get((Object) null);
        Class<? extends Object> term55899 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55898 = ((Class) term55899).getDeclaredField((String) "InTableText");
        ((Field) term55898).setAccessible(true);
        Object enum145 = ((Field) term55898).get((Object) null);
        Class<? extends Object> term56124 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56123 = ((Class) term56124).getDeclaredField((String) "InCaption");
        ((Field) term56123).setAccessible(true);
        Object enum146 = ((Field) term56123).get((Object) null);
        Class<? extends Object> term56343 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56342 = ((Class) term56343).getDeclaredField((String) "InColumnGroup");
        ((Field) term56342).setAccessible(true);
        Object enum147 = ((Field) term56342).get((Object) null);
        Class<? extends Object> term56574 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56573 = ((Class) term56574).getDeclaredField((String) "InTableBody");
        ((Field) term56573).setAccessible(true);
        Object enum148 = ((Field) term56573).get((Object) null);
        Class<? extends Object> term56799 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56798 = ((Class) term56799).getDeclaredField((String) "InRow");
        ((Field) term56798).setAccessible(true);
        Object enum149 = ((Field) term56798).get((Object) null);
        Class<? extends Object> term57006 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57005 = ((Class) term57006).getDeclaredField((String) "InCell");
        ((Field) term57005).setAccessible(true);
        Object enum150 = ((Field) term57005).get((Object) null);
        Class<? extends Object> term57216 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57215 = ((Class) term57216).getDeclaredField((String) "InSelect");
        ((Field) term57215).setAccessible(true);
        Object enum151 = ((Field) term57215).get((Object) null);
        Class<? extends Object> term57432 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57431 = ((Class) term57432).getDeclaredField((String) "InSelectInTable");
        ((Field) term57431).setAccessible(true);
        Object enum152 = ((Field) term57431).get((Object) null);
        Class<? extends Object> term57669 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57668 = ((Class) term57669).getDeclaredField((String) "AfterBody");
        ((Field) term57668).setAccessible(true);
        Object enum153 = ((Field) term57668).get((Object) null);
        Class<? extends Object> term57888 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57887 = ((Class) term57888).getDeclaredField((String) "InFrameset");
        ((Field) term57887).setAccessible(true);
        Object enum154 = ((Field) term57887).get((Object) null);
        Class<? extends Object> term58110 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58109 = ((Class) term58110).getDeclaredField((String) "AfterFrameset");
        ((Field) term58109).setAccessible(true);
        Object enum155 = ((Field) term58109).get((Object) null);
        Class<? extends Object> term58341 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58340 = ((Class) term58341).getDeclaredField((String) "AfterAfterBody");
        ((Field) term58340).setAccessible(true);
        Object enum156 = ((Field) term58340).get((Object) null);
        Class<? extends Object> term58575 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58574 = ((Class) term58575).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term58574).setAccessible(true);
        Object enum157 = ((Field) term58574).get((Object) null);
        Class<? extends Object> term58823 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58822 = ((Class) term58823).getDeclaredField((String) "ForeignContent");
        ((Field) term58822).setAccessible(true);
        Object enum158 = ((Field) term58822).get((Object) null);
        term53629 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term53629, 0, enum136);
        setElement(term53629, 1, enum137);
        setElement(term53629, 2, enum138);
        setElement(term53629, 3, enum139);
        setElement(term53629, 4, enum140);
        setElement(term53629, 5, enum141);
        setElement(term53629, 6, enum142);
        setElement(term53629, 7, enum143);
        setElement(term53629, 8, enum144);
        setElement(term53629, 9, enum145);
        setElement(term53629, 10, enum146);
        setElement(term53629, 11, enum147);
        setElement(term53629, 12, enum148);
        setElement(term53629, 13, enum149);
        setElement(term53629, 14, enum150);
        setElement(term53629, 15, enum151);
        setElement(term53629, 16, enum152);
        setElement(term53629, 17, enum153);
        setElement(term53629, 18, enum154);
        setElement(term53629, 19, enum155);
        setElement(term53629, 20, enum156);
        setElement(term53629, 21, enum157);
        setElement(term53629, 22, enum158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term53629));
    }

};


