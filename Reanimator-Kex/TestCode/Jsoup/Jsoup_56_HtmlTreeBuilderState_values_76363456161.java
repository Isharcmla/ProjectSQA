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

public class HtmlTreeBuilderState_values_76363456161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44840;

    public HtmlTreeBuilderState_values_76363456161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45163 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45162 = ((Class) term45163).getDeclaredField((String) "Initial");
        ((Field) term45162).setAccessible(true);
        Object enum111 = ((Field) term45162).get((Object) null);
        Class<? extends Object> term45376 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45375 = ((Class) term45376).getDeclaredField((String) "BeforeHtml");
        ((Field) term45375).setAccessible(true);
        Object enum112 = ((Field) term45375).get((Object) null);
        Class<? extends Object> term45598 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45597 = ((Class) term45598).getDeclaredField((String) "BeforeHead");
        ((Field) term45597).setAccessible(true);
        Object enum113 = ((Field) term45597).get((Object) null);
        Class<? extends Object> term45820 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45819 = ((Class) term45820).getDeclaredField((String) "InHead");
        ((Field) term45819).setAccessible(true);
        Object enum114 = ((Field) term45819).get((Object) null);
        Class<? extends Object> term46030 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46029 = ((Class) term46030).getDeclaredField((String) "InHeadNoscript");
        ((Field) term46029).setAccessible(true);
        Object enum115 = ((Field) term46029).get((Object) null);
        Class<? extends Object> term46264 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46263 = ((Class) term46264).getDeclaredField((String) "AfterHead");
        ((Field) term46263).setAccessible(true);
        Object enum116 = ((Field) term46263).get((Object) null);
        Class<? extends Object> term46483 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46482 = ((Class) term46483).getDeclaredField((String) "InBody");
        ((Field) term46482).setAccessible(true);
        Object enum117 = ((Field) term46482).get((Object) null);
        Class<? extends Object> term46693 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46692 = ((Class) term46693).getDeclaredField((String) "Text");
        ((Field) term46692).setAccessible(true);
        Object enum118 = ((Field) term46692).get((Object) null);
        Class<? extends Object> term46897 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46896 = ((Class) term46897).getDeclaredField((String) "InTable");
        ((Field) term46896).setAccessible(true);
        Object enum119 = ((Field) term46896).get((Object) null);
        Class<? extends Object> term47110 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47109 = ((Class) term47110).getDeclaredField((String) "InTableText");
        ((Field) term47109).setAccessible(true);
        Object enum120 = ((Field) term47109).get((Object) null);
        Class<? extends Object> term47335 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47334 = ((Class) term47335).getDeclaredField((String) "InCaption");
        ((Field) term47334).setAccessible(true);
        Object enum121 = ((Field) term47334).get((Object) null);
        Class<? extends Object> term47554 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47553 = ((Class) term47554).getDeclaredField((String) "InColumnGroup");
        ((Field) term47553).setAccessible(true);
        Object enum122 = ((Field) term47553).get((Object) null);
        Class<? extends Object> term47785 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47784 = ((Class) term47785).getDeclaredField((String) "InTableBody");
        ((Field) term47784).setAccessible(true);
        Object enum123 = ((Field) term47784).get((Object) null);
        Class<? extends Object> term48010 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48009 = ((Class) term48010).getDeclaredField((String) "InRow");
        ((Field) term48009).setAccessible(true);
        Object enum124 = ((Field) term48009).get((Object) null);
        Class<? extends Object> term48217 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48216 = ((Class) term48217).getDeclaredField((String) "InCell");
        ((Field) term48216).setAccessible(true);
        Object enum125 = ((Field) term48216).get((Object) null);
        Class<? extends Object> term48427 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48426 = ((Class) term48427).getDeclaredField((String) "InSelect");
        ((Field) term48426).setAccessible(true);
        Object enum126 = ((Field) term48426).get((Object) null);
        Class<? extends Object> term48643 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48642 = ((Class) term48643).getDeclaredField((String) "InSelectInTable");
        ((Field) term48642).setAccessible(true);
        Object enum127 = ((Field) term48642).get((Object) null);
        Class<? extends Object> term48880 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48879 = ((Class) term48880).getDeclaredField((String) "AfterBody");
        ((Field) term48879).setAccessible(true);
        Object enum128 = ((Field) term48879).get((Object) null);
        Class<? extends Object> term49099 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49098 = ((Class) term49099).getDeclaredField((String) "InFrameset");
        ((Field) term49098).setAccessible(true);
        Object enum129 = ((Field) term49098).get((Object) null);
        Class<? extends Object> term49321 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49320 = ((Class) term49321).getDeclaredField((String) "AfterFrameset");
        ((Field) term49320).setAccessible(true);
        Object enum130 = ((Field) term49320).get((Object) null);
        Class<? extends Object> term49552 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49551 = ((Class) term49552).getDeclaredField((String) "AfterAfterBody");
        ((Field) term49551).setAccessible(true);
        Object enum131 = ((Field) term49551).get((Object) null);
        Class<? extends Object> term49786 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term49785 = ((Class) term49786).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term49785).setAccessible(true);
        Object enum132 = ((Field) term49785).get((Object) null);
        Class<? extends Object> term50032 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term50031 = ((Class) term50032).getDeclaredField((String) "ForeignContent");
        ((Field) term50031).setAccessible(true);
        Object enum133 = ((Field) term50031).get((Object) null);
        term44840 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term44840, 0, enum111);
        setElement(term44840, 1, enum112);
        setElement(term44840, 2, enum113);
        setElement(term44840, 3, enum114);
        setElement(term44840, 4, enum115);
        setElement(term44840, 5, enum116);
        setElement(term44840, 6, enum117);
        setElement(term44840, 7, enum118);
        setElement(term44840, 8, enum119);
        setElement(term44840, 9, enum120);
        setElement(term44840, 10, enum121);
        setElement(term44840, 11, enum122);
        setElement(term44840, 12, enum123);
        setElement(term44840, 13, enum124);
        setElement(term44840, 14, enum125);
        setElement(term44840, 15, enum126);
        setElement(term44840, 16, enum127);
        setElement(term44840, 17, enum128);
        setElement(term44840, 18, enum129);
        setElement(term44840, 19, enum130);
        setElement(term44840, 20, enum131);
        setElement(term44840, 21, enum132);
        setElement(term44840, 22, enum133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term44840));
    }

};


