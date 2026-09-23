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

public class HtmlTreeBuilderState_values_76363456139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51083;

    public HtmlTreeBuilderState_values_76363456139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51406 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51405 = ((Class) term51406).getDeclaredField((String) "Initial");
        ((Field) term51405).setAccessible(true);
        Object enum141 = ((Field) term51405).get((Object) null);
        Class<? extends Object> term51619 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51618 = ((Class) term51619).getDeclaredField((String) "BeforeHtml");
        ((Field) term51618).setAccessible(true);
        Object enum142 = ((Field) term51618).get((Object) null);
        Class<? extends Object> term51841 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51840 = ((Class) term51841).getDeclaredField((String) "BeforeHead");
        ((Field) term51840).setAccessible(true);
        Object enum143 = ((Field) term51840).get((Object) null);
        Class<? extends Object> term52063 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52062 = ((Class) term52063).getDeclaredField((String) "InHead");
        ((Field) term52062).setAccessible(true);
        Object enum144 = ((Field) term52062).get((Object) null);
        Class<? extends Object> term52273 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52272 = ((Class) term52273).getDeclaredField((String) "InHeadNoscript");
        ((Field) term52272).setAccessible(true);
        Object enum145 = ((Field) term52272).get((Object) null);
        Class<? extends Object> term52507 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52506 = ((Class) term52507).getDeclaredField((String) "AfterHead");
        ((Field) term52506).setAccessible(true);
        Object enum146 = ((Field) term52506).get((Object) null);
        Class<? extends Object> term52726 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52725 = ((Class) term52726).getDeclaredField((String) "InBody");
        ((Field) term52725).setAccessible(true);
        Object enum147 = ((Field) term52725).get((Object) null);
        Class<? extends Object> term52936 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52935 = ((Class) term52936).getDeclaredField((String) "Text");
        ((Field) term52935).setAccessible(true);
        Object enum148 = ((Field) term52935).get((Object) null);
        Class<? extends Object> term53140 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53139 = ((Class) term53140).getDeclaredField((String) "InTable");
        ((Field) term53139).setAccessible(true);
        Object enum149 = ((Field) term53139).get((Object) null);
        Class<? extends Object> term53353 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53352 = ((Class) term53353).getDeclaredField((String) "InTableText");
        ((Field) term53352).setAccessible(true);
        Object enum150 = ((Field) term53352).get((Object) null);
        Class<? extends Object> term53578 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53577 = ((Class) term53578).getDeclaredField((String) "InCaption");
        ((Field) term53577).setAccessible(true);
        Object enum151 = ((Field) term53577).get((Object) null);
        Class<? extends Object> term53797 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53796 = ((Class) term53797).getDeclaredField((String) "InColumnGroup");
        ((Field) term53796).setAccessible(true);
        Object enum152 = ((Field) term53796).get((Object) null);
        Class<? extends Object> term54028 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54027 = ((Class) term54028).getDeclaredField((String) "InTableBody");
        ((Field) term54027).setAccessible(true);
        Object enum153 = ((Field) term54027).get((Object) null);
        Class<? extends Object> term54253 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54252 = ((Class) term54253).getDeclaredField((String) "InRow");
        ((Field) term54252).setAccessible(true);
        Object enum154 = ((Field) term54252).get((Object) null);
        Class<? extends Object> term54460 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54459 = ((Class) term54460).getDeclaredField((String) "InCell");
        ((Field) term54459).setAccessible(true);
        Object enum155 = ((Field) term54459).get((Object) null);
        Class<? extends Object> term54670 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54669 = ((Class) term54670).getDeclaredField((String) "InSelect");
        ((Field) term54669).setAccessible(true);
        Object enum156 = ((Field) term54669).get((Object) null);
        Class<? extends Object> term54886 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54885 = ((Class) term54886).getDeclaredField((String) "InSelectInTable");
        ((Field) term54885).setAccessible(true);
        Object enum157 = ((Field) term54885).get((Object) null);
        Class<? extends Object> term55123 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55122 = ((Class) term55123).getDeclaredField((String) "AfterBody");
        ((Field) term55122).setAccessible(true);
        Object enum158 = ((Field) term55122).get((Object) null);
        Class<? extends Object> term55342 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55341 = ((Class) term55342).getDeclaredField((String) "InFrameset");
        ((Field) term55341).setAccessible(true);
        Object enum159 = ((Field) term55341).get((Object) null);
        Class<? extends Object> term55564 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55563 = ((Class) term55564).getDeclaredField((String) "AfterFrameset");
        ((Field) term55563).setAccessible(true);
        Object enum160 = ((Field) term55563).get((Object) null);
        Class<? extends Object> term55795 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55794 = ((Class) term55795).getDeclaredField((String) "AfterAfterBody");
        ((Field) term55794).setAccessible(true);
        Object enum161 = ((Field) term55794).get((Object) null);
        Class<? extends Object> term56029 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56028 = ((Class) term56029).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term56028).setAccessible(true);
        Object enum162 = ((Field) term56028).get((Object) null);
        Class<? extends Object> term56275 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56274 = ((Class) term56275).getDeclaredField((String) "ForeignContent");
        ((Field) term56274).setAccessible(true);
        Object enum163 = ((Field) term56274).get((Object) null);
        term51083 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term51083, 0, enum141);
        setElement(term51083, 1, enum142);
        setElement(term51083, 2, enum143);
        setElement(term51083, 3, enum144);
        setElement(term51083, 4, enum145);
        setElement(term51083, 5, enum146);
        setElement(term51083, 6, enum147);
        setElement(term51083, 7, enum148);
        setElement(term51083, 8, enum149);
        setElement(term51083, 9, enum150);
        setElement(term51083, 10, enum151);
        setElement(term51083, 11, enum152);
        setElement(term51083, 12, enum153);
        setElement(term51083, 13, enum154);
        setElement(term51083, 14, enum155);
        setElement(term51083, 15, enum156);
        setElement(term51083, 16, enum157);
        setElement(term51083, 17, enum158);
        setElement(term51083, 18, enum159);
        setElement(term51083, 19, enum160);
        setElement(term51083, 20, enum161);
        setElement(term51083, 21, enum162);
        setElement(term51083, 22, enum163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term51083));
    }

};


