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

public class HtmlTreeBuilderState_values_76363456163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50748;

    public HtmlTreeBuilderState_values_76363456163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51071 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51070 = ((Class) term51071).getDeclaredField((String) "Initial");
        ((Field) term51070).setAccessible(true);
        Object enum134 = ((Field) term51070).get((Object) null);
        Class<? extends Object> term51284 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51283 = ((Class) term51284).getDeclaredField((String) "BeforeHtml");
        ((Field) term51283).setAccessible(true);
        Object enum135 = ((Field) term51283).get((Object) null);
        Class<? extends Object> term51506 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51505 = ((Class) term51506).getDeclaredField((String) "BeforeHead");
        ((Field) term51505).setAccessible(true);
        Object enum136 = ((Field) term51505).get((Object) null);
        Class<? extends Object> term51728 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51727 = ((Class) term51728).getDeclaredField((String) "InHead");
        ((Field) term51727).setAccessible(true);
        Object enum137 = ((Field) term51727).get((Object) null);
        Class<? extends Object> term51938 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51937 = ((Class) term51938).getDeclaredField((String) "InHeadNoscript");
        ((Field) term51937).setAccessible(true);
        Object enum138 = ((Field) term51937).get((Object) null);
        Class<? extends Object> term52172 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52171 = ((Class) term52172).getDeclaredField((String) "AfterHead");
        ((Field) term52171).setAccessible(true);
        Object enum139 = ((Field) term52171).get((Object) null);
        Class<? extends Object> term52391 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52390 = ((Class) term52391).getDeclaredField((String) "InBody");
        ((Field) term52390).setAccessible(true);
        Object enum140 = ((Field) term52390).get((Object) null);
        Class<? extends Object> term52601 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52600 = ((Class) term52601).getDeclaredField((String) "Text");
        ((Field) term52600).setAccessible(true);
        Object enum141 = ((Field) term52600).get((Object) null);
        Class<? extends Object> term52805 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52804 = ((Class) term52805).getDeclaredField((String) "InTable");
        ((Field) term52804).setAccessible(true);
        Object enum142 = ((Field) term52804).get((Object) null);
        Class<? extends Object> term53018 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53017 = ((Class) term53018).getDeclaredField((String) "InTableText");
        ((Field) term53017).setAccessible(true);
        Object enum143 = ((Field) term53017).get((Object) null);
        Class<? extends Object> term53243 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53242 = ((Class) term53243).getDeclaredField((String) "InCaption");
        ((Field) term53242).setAccessible(true);
        Object enum144 = ((Field) term53242).get((Object) null);
        Class<? extends Object> term53462 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53461 = ((Class) term53462).getDeclaredField((String) "InColumnGroup");
        ((Field) term53461).setAccessible(true);
        Object enum145 = ((Field) term53461).get((Object) null);
        Class<? extends Object> term53693 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53692 = ((Class) term53693).getDeclaredField((String) "InTableBody");
        ((Field) term53692).setAccessible(true);
        Object enum146 = ((Field) term53692).get((Object) null);
        Class<? extends Object> term53918 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53917 = ((Class) term53918).getDeclaredField((String) "InRow");
        ((Field) term53917).setAccessible(true);
        Object enum147 = ((Field) term53917).get((Object) null);
        Class<? extends Object> term54125 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54124 = ((Class) term54125).getDeclaredField((String) "InCell");
        ((Field) term54124).setAccessible(true);
        Object enum148 = ((Field) term54124).get((Object) null);
        Class<? extends Object> term54335 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54334 = ((Class) term54335).getDeclaredField((String) "InSelect");
        ((Field) term54334).setAccessible(true);
        Object enum149 = ((Field) term54334).get((Object) null);
        Class<? extends Object> term54551 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54550 = ((Class) term54551).getDeclaredField((String) "InSelectInTable");
        ((Field) term54550).setAccessible(true);
        Object enum150 = ((Field) term54550).get((Object) null);
        Class<? extends Object> term54788 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54787 = ((Class) term54788).getDeclaredField((String) "AfterBody");
        ((Field) term54787).setAccessible(true);
        Object enum151 = ((Field) term54787).get((Object) null);
        Class<? extends Object> term55007 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55006 = ((Class) term55007).getDeclaredField((String) "InFrameset");
        ((Field) term55006).setAccessible(true);
        Object enum152 = ((Field) term55006).get((Object) null);
        Class<? extends Object> term55229 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55228 = ((Class) term55229).getDeclaredField((String) "AfterFrameset");
        ((Field) term55228).setAccessible(true);
        Object enum153 = ((Field) term55228).get((Object) null);
        Class<? extends Object> term55460 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55459 = ((Class) term55460).getDeclaredField((String) "AfterAfterBody");
        ((Field) term55459).setAccessible(true);
        Object enum154 = ((Field) term55459).get((Object) null);
        Class<? extends Object> term55694 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55693 = ((Class) term55694).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term55693).setAccessible(true);
        Object enum155 = ((Field) term55693).get((Object) null);
        Class<? extends Object> term55940 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55939 = ((Class) term55940).getDeclaredField((String) "ForeignContent");
        ((Field) term55939).setAccessible(true);
        Object enum156 = ((Field) term55939).get((Object) null);
        term50748 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term50748, 0, enum134);
        setElement(term50748, 1, enum135);
        setElement(term50748, 2, enum136);
        setElement(term50748, 3, enum137);
        setElement(term50748, 4, enum138);
        setElement(term50748, 5, enum139);
        setElement(term50748, 6, enum140);
        setElement(term50748, 7, enum141);
        setElement(term50748, 8, enum142);
        setElement(term50748, 9, enum143);
        setElement(term50748, 10, enum144);
        setElement(term50748, 11, enum145);
        setElement(term50748, 12, enum146);
        setElement(term50748, 13, enum147);
        setElement(term50748, 14, enum148);
        setElement(term50748, 15, enum149);
        setElement(term50748, 16, enum150);
        setElement(term50748, 17, enum151);
        setElement(term50748, 18, enum152);
        setElement(term50748, 19, enum153);
        setElement(term50748, 20, enum154);
        setElement(term50748, 21, enum155);
        setElement(term50748, 22, enum156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term50748));
    }

};


