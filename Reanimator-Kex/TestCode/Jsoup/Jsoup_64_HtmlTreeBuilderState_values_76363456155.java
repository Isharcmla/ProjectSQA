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

public class HtmlTreeBuilderState_values_76363456155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48982;

    public HtmlTreeBuilderState_values_76363456155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49305 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49304 = ((Class) term49305).getDeclaredField((String) "Initial");
        ((Field) term49304).setAccessible(true);
        Object enum138 = ((Field) term49304).get((Object) null);
        Class<? extends Object> term49518 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49517 = ((Class) term49518).getDeclaredField((String) "BeforeHtml");
        ((Field) term49517).setAccessible(true);
        Object enum139 = ((Field) term49517).get((Object) null);
        Class<? extends Object> term49740 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49739 = ((Class) term49740).getDeclaredField((String) "BeforeHead");
        ((Field) term49739).setAccessible(true);
        Object enum140 = ((Field) term49739).get((Object) null);
        Class<? extends Object> term49962 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49961 = ((Class) term49962).getDeclaredField((String) "InHead");
        ((Field) term49961).setAccessible(true);
        Object enum141 = ((Field) term49961).get((Object) null);
        Class<? extends Object> term50172 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term50171 = ((Class) term50172).getDeclaredField((String) "InHeadNoscript");
        ((Field) term50171).setAccessible(true);
        Object enum142 = ((Field) term50171).get((Object) null);
        Class<? extends Object> term50406 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term50405 = ((Class) term50406).getDeclaredField((String) "AfterHead");
        ((Field) term50405).setAccessible(true);
        Object enum143 = ((Field) term50405).get((Object) null);
        Class<? extends Object> term50625 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term50624 = ((Class) term50625).getDeclaredField((String) "InBody");
        ((Field) term50624).setAccessible(true);
        Object enum144 = ((Field) term50624).get((Object) null);
        Class<? extends Object> term50835 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term50834 = ((Class) term50835).getDeclaredField((String) "Text");
        ((Field) term50834).setAccessible(true);
        Object enum145 = ((Field) term50834).get((Object) null);
        Class<? extends Object> term51039 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51038 = ((Class) term51039).getDeclaredField((String) "InTable");
        ((Field) term51038).setAccessible(true);
        Object enum146 = ((Field) term51038).get((Object) null);
        Class<? extends Object> term51260 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51259 = ((Class) term51260).getDeclaredField((String) "InTableText");
        ((Field) term51259).setAccessible(true);
        Object enum147 = ((Field) term51259).get((Object) null);
        Class<? extends Object> term51485 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51484 = ((Class) term51485).getDeclaredField((String) "InCaption");
        ((Field) term51484).setAccessible(true);
        Object enum148 = ((Field) term51484).get((Object) null);
        Class<? extends Object> term51704 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51703 = ((Class) term51704).getDeclaredField((String) "InColumnGroup");
        ((Field) term51703).setAccessible(true);
        Object enum149 = ((Field) term51703).get((Object) null);
        Class<? extends Object> term51935 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51934 = ((Class) term51935).getDeclaredField((String) "InTableBody");
        ((Field) term51934).setAccessible(true);
        Object enum150 = ((Field) term51934).get((Object) null);
        Class<? extends Object> term52160 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52159 = ((Class) term52160).getDeclaredField((String) "InRow");
        ((Field) term52159).setAccessible(true);
        Object enum151 = ((Field) term52159).get((Object) null);
        Class<? extends Object> term52367 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52366 = ((Class) term52367).getDeclaredField((String) "InCell");
        ((Field) term52366).setAccessible(true);
        Object enum152 = ((Field) term52366).get((Object) null);
        Class<? extends Object> term52577 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52576 = ((Class) term52577).getDeclaredField((String) "InSelect");
        ((Field) term52576).setAccessible(true);
        Object enum153 = ((Field) term52576).get((Object) null);
        Class<? extends Object> term52793 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52792 = ((Class) term52793).getDeclaredField((String) "InSelectInTable");
        ((Field) term52792).setAccessible(true);
        Object enum154 = ((Field) term52792).get((Object) null);
        Class<? extends Object> term53030 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53029 = ((Class) term53030).getDeclaredField((String) "AfterBody");
        ((Field) term53029).setAccessible(true);
        Object enum155 = ((Field) term53029).get((Object) null);
        Class<? extends Object> term53249 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53248 = ((Class) term53249).getDeclaredField((String) "InFrameset");
        ((Field) term53248).setAccessible(true);
        Object enum156 = ((Field) term53248).get((Object) null);
        Class<? extends Object> term53471 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53470 = ((Class) term53471).getDeclaredField((String) "AfterFrameset");
        ((Field) term53470).setAccessible(true);
        Object enum157 = ((Field) term53470).get((Object) null);
        Class<? extends Object> term53702 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53701 = ((Class) term53702).getDeclaredField((String) "AfterAfterBody");
        ((Field) term53701).setAccessible(true);
        Object enum158 = ((Field) term53701).get((Object) null);
        Class<? extends Object> term53936 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53935 = ((Class) term53936).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term53935).setAccessible(true);
        Object enum159 = ((Field) term53935).get((Object) null);
        Class<? extends Object> term54182 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54181 = ((Class) term54182).getDeclaredField((String) "ForeignContent");
        ((Field) term54181).setAccessible(true);
        Object enum160 = ((Field) term54181).get((Object) null);
        term48982 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term48982, 0, enum138);
        setElement(term48982, 1, enum139);
        setElement(term48982, 2, enum140);
        setElement(term48982, 3, enum141);
        setElement(term48982, 4, enum142);
        setElement(term48982, 5, enum143);
        setElement(term48982, 6, enum144);
        setElement(term48982, 7, enum145);
        setElement(term48982, 8, enum146);
        setElement(term48982, 9, enum147);
        setElement(term48982, 10, enum148);
        setElement(term48982, 11, enum149);
        setElement(term48982, 12, enum150);
        setElement(term48982, 13, enum151);
        setElement(term48982, 14, enum152);
        setElement(term48982, 15, enum153);
        setElement(term48982, 16, enum154);
        setElement(term48982, 17, enum155);
        setElement(term48982, 18, enum156);
        setElement(term48982, 19, enum157);
        setElement(term48982, 20, enum158);
        setElement(term48982, 21, enum159);
        setElement(term48982, 22, enum160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term48982));
    }

};


