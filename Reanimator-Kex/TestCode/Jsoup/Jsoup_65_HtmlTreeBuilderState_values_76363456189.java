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

public class HtmlTreeBuilderState_values_76363456189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79296;

    public HtmlTreeBuilderState_values_76363456189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79619 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term79618 = ((Class) term79619).getDeclaredField((String) "Initial");
        ((Field) term79618).setAccessible(true);
        Object enum189 = ((Field) term79618).get((Object) null);
        Class<? extends Object> term79832 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term79831 = ((Class) term79832).getDeclaredField((String) "BeforeHtml");
        ((Field) term79831).setAccessible(true);
        Object enum190 = ((Field) term79831).get((Object) null);
        Class<? extends Object> term80054 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term80053 = ((Class) term80054).getDeclaredField((String) "BeforeHead");
        ((Field) term80053).setAccessible(true);
        Object enum191 = ((Field) term80053).get((Object) null);
        Class<? extends Object> term80276 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term80275 = ((Class) term80276).getDeclaredField((String) "InHead");
        ((Field) term80275).setAccessible(true);
        Object enum192 = ((Field) term80275).get((Object) null);
        Class<? extends Object> term80486 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term80485 = ((Class) term80486).getDeclaredField((String) "InHeadNoscript");
        ((Field) term80485).setAccessible(true);
        Object enum193 = ((Field) term80485).get((Object) null);
        Class<? extends Object> term80720 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term80719 = ((Class) term80720).getDeclaredField((String) "AfterHead");
        ((Field) term80719).setAccessible(true);
        Object enum194 = ((Field) term80719).get((Object) null);
        Class<? extends Object> term80939 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term80938 = ((Class) term80939).getDeclaredField((String) "InBody");
        ((Field) term80938).setAccessible(true);
        Object enum195 = ((Field) term80938).get((Object) null);
        Class<? extends Object> term81149 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term81148 = ((Class) term81149).getDeclaredField((String) "Text");
        ((Field) term81148).setAccessible(true);
        Object enum196 = ((Field) term81148).get((Object) null);
        Class<? extends Object> term81365 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term81364 = ((Class) term81365).getDeclaredField((String) "InTable");
        ((Field) term81364).setAccessible(true);
        Object enum197 = ((Field) term81364).get((Object) null);
        Class<? extends Object> term81578 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term81577 = ((Class) term81578).getDeclaredField((String) "InTableText");
        ((Field) term81577).setAccessible(true);
        Object enum198 = ((Field) term81577).get((Object) null);
        Class<? extends Object> term81803 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term81802 = ((Class) term81803).getDeclaredField((String) "InCaption");
        ((Field) term81802).setAccessible(true);
        Object enum199 = ((Field) term81802).get((Object) null);
        Class<? extends Object> term82022 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term82021 = ((Class) term82022).getDeclaredField((String) "InColumnGroup");
        ((Field) term82021).setAccessible(true);
        Object enum200 = ((Field) term82021).get((Object) null);
        Class<? extends Object> term82253 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term82252 = ((Class) term82253).getDeclaredField((String) "InTableBody");
        ((Field) term82252).setAccessible(true);
        Object enum201 = ((Field) term82252).get((Object) null);
        Class<? extends Object> term82478 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term82477 = ((Class) term82478).getDeclaredField((String) "InRow");
        ((Field) term82477).setAccessible(true);
        Object enum202 = ((Field) term82477).get((Object) null);
        Class<? extends Object> term82685 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term82684 = ((Class) term82685).getDeclaredField((String) "InCell");
        ((Field) term82684).setAccessible(true);
        Object enum203 = ((Field) term82684).get((Object) null);
        Class<? extends Object> term82895 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term82894 = ((Class) term82895).getDeclaredField((String) "InSelect");
        ((Field) term82894).setAccessible(true);
        Object enum204 = ((Field) term82894).get((Object) null);
        Class<? extends Object> term83111 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term83110 = ((Class) term83111).getDeclaredField((String) "InSelectInTable");
        ((Field) term83110).setAccessible(true);
        Object enum205 = ((Field) term83110).get((Object) null);
        Class<? extends Object> term83348 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term83347 = ((Class) term83348).getDeclaredField((String) "AfterBody");
        ((Field) term83347).setAccessible(true);
        Object enum206 = ((Field) term83347).get((Object) null);
        Class<? extends Object> term83567 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term83566 = ((Class) term83567).getDeclaredField((String) "InFrameset");
        ((Field) term83566).setAccessible(true);
        Object enum207 = ((Field) term83566).get((Object) null);
        Class<? extends Object> term83789 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term83788 = ((Class) term83789).getDeclaredField((String) "AfterFrameset");
        ((Field) term83788).setAccessible(true);
        Object enum208 = ((Field) term83788).get((Object) null);
        Class<? extends Object> term84020 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term84019 = ((Class) term84020).getDeclaredField((String) "AfterAfterBody");
        ((Field) term84019).setAccessible(true);
        Object enum209 = ((Field) term84019).get((Object) null);
        Class<? extends Object> term84254 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term84253 = ((Class) term84254).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term84253).setAccessible(true);
        Object enum210 = ((Field) term84253).get((Object) null);
        Class<? extends Object> term84500 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term84499 = ((Class) term84500).getDeclaredField((String) "ForeignContent");
        ((Field) term84499).setAccessible(true);
        Object enum211 = ((Field) term84499).get((Object) null);
        term79296 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term79296, 0, enum189);
        setElement(term79296, 1, enum190);
        setElement(term79296, 2, enum191);
        setElement(term79296, 3, enum192);
        setElement(term79296, 4, enum193);
        setElement(term79296, 5, enum194);
        setElement(term79296, 6, enum195);
        setElement(term79296, 7, enum196);
        setElement(term79296, 8, enum197);
        setElement(term79296, 9, enum198);
        setElement(term79296, 10, enum199);
        setElement(term79296, 11, enum200);
        setElement(term79296, 12, enum201);
        setElement(term79296, 13, enum202);
        setElement(term79296, 14, enum203);
        setElement(term79296, 15, enum204);
        setElement(term79296, 16, enum205);
        setElement(term79296, 17, enum206);
        setElement(term79296, 18, enum207);
        setElement(term79296, 19, enum208);
        setElement(term79296, 20, enum209);
        setElement(term79296, 21, enum210);
        setElement(term79296, 22, enum211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term79296));
    }

};


