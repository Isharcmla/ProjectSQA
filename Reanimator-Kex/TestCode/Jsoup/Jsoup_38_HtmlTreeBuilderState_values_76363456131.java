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

public class HtmlTreeBuilderState_values_76363456131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42994;

    public HtmlTreeBuilderState_values_76363456131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43317 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term43316 = ((Class) term43317).getDeclaredField((String) "Initial");
        ((Field) term43316).setAccessible(true);
        Object enum115 = ((Field) term43316).get((Object) null);
        Class<? extends Object> term43530 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term43529 = ((Class) term43530).getDeclaredField((String) "BeforeHtml");
        ((Field) term43529).setAccessible(true);
        Object enum116 = ((Field) term43529).get((Object) null);
        Class<? extends Object> term43752 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term43751 = ((Class) term43752).getDeclaredField((String) "BeforeHead");
        ((Field) term43751).setAccessible(true);
        Object enum117 = ((Field) term43751).get((Object) null);
        Class<? extends Object> term43974 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term43973 = ((Class) term43974).getDeclaredField((String) "InHead");
        ((Field) term43973).setAccessible(true);
        Object enum118 = ((Field) term43973).get((Object) null);
        Class<? extends Object> term44184 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term44183 = ((Class) term44184).getDeclaredField((String) "InHeadNoscript");
        ((Field) term44183).setAccessible(true);
        Object enum119 = ((Field) term44183).get((Object) null);
        Class<? extends Object> term44418 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term44417 = ((Class) term44418).getDeclaredField((String) "AfterHead");
        ((Field) term44417).setAccessible(true);
        Object enum120 = ((Field) term44417).get((Object) null);
        Class<? extends Object> term44637 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term44636 = ((Class) term44637).getDeclaredField((String) "InBody");
        ((Field) term44636).setAccessible(true);
        Object enum121 = ((Field) term44636).get((Object) null);
        Class<? extends Object> term44847 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term44846 = ((Class) term44847).getDeclaredField((String) "Text");
        ((Field) term44846).setAccessible(true);
        Object enum122 = ((Field) term44846).get((Object) null);
        Class<? extends Object> term45051 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45050 = ((Class) term45051).getDeclaredField((String) "InTable");
        ((Field) term45050).setAccessible(true);
        Object enum123 = ((Field) term45050).get((Object) null);
        Class<? extends Object> term45264 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45263 = ((Class) term45264).getDeclaredField((String) "InTableText");
        ((Field) term45263).setAccessible(true);
        Object enum124 = ((Field) term45263).get((Object) null);
        Class<? extends Object> term45489 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45488 = ((Class) term45489).getDeclaredField((String) "InCaption");
        ((Field) term45488).setAccessible(true);
        Object enum125 = ((Field) term45488).get((Object) null);
        Class<? extends Object> term45708 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45707 = ((Class) term45708).getDeclaredField((String) "InColumnGroup");
        ((Field) term45707).setAccessible(true);
        Object enum126 = ((Field) term45707).get((Object) null);
        Class<? extends Object> term45939 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45938 = ((Class) term45939).getDeclaredField((String) "InTableBody");
        ((Field) term45938).setAccessible(true);
        Object enum127 = ((Field) term45938).get((Object) null);
        Class<? extends Object> term46164 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46163 = ((Class) term46164).getDeclaredField((String) "InRow");
        ((Field) term46163).setAccessible(true);
        Object enum128 = ((Field) term46163).get((Object) null);
        Class<? extends Object> term46371 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46370 = ((Class) term46371).getDeclaredField((String) "InCell");
        ((Field) term46370).setAccessible(true);
        Object enum129 = ((Field) term46370).get((Object) null);
        Class<? extends Object> term46581 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46580 = ((Class) term46581).getDeclaredField((String) "InSelect");
        ((Field) term46580).setAccessible(true);
        Object enum130 = ((Field) term46580).get((Object) null);
        Class<? extends Object> term46797 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46796 = ((Class) term46797).getDeclaredField((String) "InSelectInTable");
        ((Field) term46796).setAccessible(true);
        Object enum131 = ((Field) term46796).get((Object) null);
        Class<? extends Object> term47034 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47033 = ((Class) term47034).getDeclaredField((String) "AfterBody");
        ((Field) term47033).setAccessible(true);
        Object enum132 = ((Field) term47033).get((Object) null);
        Class<? extends Object> term47253 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47252 = ((Class) term47253).getDeclaredField((String) "InFrameset");
        ((Field) term47252).setAccessible(true);
        Object enum133 = ((Field) term47252).get((Object) null);
        Class<? extends Object> term47475 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47474 = ((Class) term47475).getDeclaredField((String) "AfterFrameset");
        ((Field) term47474).setAccessible(true);
        Object enum134 = ((Field) term47474).get((Object) null);
        Class<? extends Object> term47706 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47705 = ((Class) term47706).getDeclaredField((String) "AfterAfterBody");
        ((Field) term47705).setAccessible(true);
        Object enum135 = ((Field) term47705).get((Object) null);
        Class<? extends Object> term47940 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47939 = ((Class) term47940).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term47939).setAccessible(true);
        Object enum136 = ((Field) term47939).get((Object) null);
        Class<? extends Object> term48186 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48185 = ((Class) term48186).getDeclaredField((String) "ForeignContent");
        ((Field) term48185).setAccessible(true);
        Object enum137 = ((Field) term48185).get((Object) null);
        term42994 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term42994, 0, enum115);
        setElement(term42994, 1, enum116);
        setElement(term42994, 2, enum117);
        setElement(term42994, 3, enum118);
        setElement(term42994, 4, enum119);
        setElement(term42994, 5, enum120);
        setElement(term42994, 6, enum121);
        setElement(term42994, 7, enum122);
        setElement(term42994, 8, enum123);
        setElement(term42994, 9, enum124);
        setElement(term42994, 10, enum125);
        setElement(term42994, 11, enum126);
        setElement(term42994, 12, enum127);
        setElement(term42994, 13, enum128);
        setElement(term42994, 14, enum129);
        setElement(term42994, 15, enum130);
        setElement(term42994, 16, enum131);
        setElement(term42994, 17, enum132);
        setElement(term42994, 18, enum133);
        setElement(term42994, 19, enum134);
        setElement(term42994, 20, enum135);
        setElement(term42994, 21, enum136);
        setElement(term42994, 22, enum137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term42994));
    }

};


