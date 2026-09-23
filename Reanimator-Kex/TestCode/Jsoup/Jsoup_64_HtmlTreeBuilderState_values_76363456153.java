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

public class HtmlTreeBuilderState_values_76363456153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43082;

    public HtmlTreeBuilderState_values_76363456153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43405 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term43404 = ((Class) term43405).getDeclaredField((String) "Initial");
        ((Field) term43404).setAccessible(true);
        Object enum115 = ((Field) term43404).get((Object) null);
        Class<? extends Object> term43618 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term43617 = ((Class) term43618).getDeclaredField((String) "BeforeHtml");
        ((Field) term43617).setAccessible(true);
        Object enum116 = ((Field) term43617).get((Object) null);
        Class<? extends Object> term43840 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term43839 = ((Class) term43840).getDeclaredField((String) "BeforeHead");
        ((Field) term43839).setAccessible(true);
        Object enum117 = ((Field) term43839).get((Object) null);
        Class<? extends Object> term44062 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term44061 = ((Class) term44062).getDeclaredField((String) "InHead");
        ((Field) term44061).setAccessible(true);
        Object enum118 = ((Field) term44061).get((Object) null);
        Class<? extends Object> term44272 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term44271 = ((Class) term44272).getDeclaredField((String) "InHeadNoscript");
        ((Field) term44271).setAccessible(true);
        Object enum119 = ((Field) term44271).get((Object) null);
        Class<? extends Object> term44506 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term44505 = ((Class) term44506).getDeclaredField((String) "AfterHead");
        ((Field) term44505).setAccessible(true);
        Object enum120 = ((Field) term44505).get((Object) null);
        Class<? extends Object> term44725 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term44724 = ((Class) term44725).getDeclaredField((String) "InBody");
        ((Field) term44724).setAccessible(true);
        Object enum121 = ((Field) term44724).get((Object) null);
        Class<? extends Object> term44935 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term44934 = ((Class) term44935).getDeclaredField((String) "Text");
        ((Field) term44934).setAccessible(true);
        Object enum122 = ((Field) term44934).get((Object) null);
        Class<? extends Object> term45139 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45138 = ((Class) term45139).getDeclaredField((String) "InTable");
        ((Field) term45138).setAccessible(true);
        Object enum123 = ((Field) term45138).get((Object) null);
        Class<? extends Object> term45352 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45351 = ((Class) term45352).getDeclaredField((String) "InTableText");
        ((Field) term45351).setAccessible(true);
        Object enum124 = ((Field) term45351).get((Object) null);
        Class<? extends Object> term45577 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45576 = ((Class) term45577).getDeclaredField((String) "InCaption");
        ((Field) term45576).setAccessible(true);
        Object enum125 = ((Field) term45576).get((Object) null);
        Class<? extends Object> term45796 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term45795 = ((Class) term45796).getDeclaredField((String) "InColumnGroup");
        ((Field) term45795).setAccessible(true);
        Object enum126 = ((Field) term45795).get((Object) null);
        Class<? extends Object> term46027 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46026 = ((Class) term46027).getDeclaredField((String) "InTableBody");
        ((Field) term46026).setAccessible(true);
        Object enum127 = ((Field) term46026).get((Object) null);
        Class<? extends Object> term46252 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46251 = ((Class) term46252).getDeclaredField((String) "InRow");
        ((Field) term46251).setAccessible(true);
        Object enum128 = ((Field) term46251).get((Object) null);
        Class<? extends Object> term46459 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46458 = ((Class) term46459).getDeclaredField((String) "InCell");
        ((Field) term46458).setAccessible(true);
        Object enum129 = ((Field) term46458).get((Object) null);
        Class<? extends Object> term46669 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46668 = ((Class) term46669).getDeclaredField((String) "InSelect");
        ((Field) term46668).setAccessible(true);
        Object enum130 = ((Field) term46668).get((Object) null);
        Class<? extends Object> term46885 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46884 = ((Class) term46885).getDeclaredField((String) "InSelectInTable");
        ((Field) term46884).setAccessible(true);
        Object enum131 = ((Field) term46884).get((Object) null);
        Class<? extends Object> term47122 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47121 = ((Class) term47122).getDeclaredField((String) "AfterBody");
        ((Field) term47121).setAccessible(true);
        Object enum132 = ((Field) term47121).get((Object) null);
        Class<? extends Object> term47341 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47340 = ((Class) term47341).getDeclaredField((String) "InFrameset");
        ((Field) term47340).setAccessible(true);
        Object enum133 = ((Field) term47340).get((Object) null);
        Class<? extends Object> term47563 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47562 = ((Class) term47563).getDeclaredField((String) "AfterFrameset");
        ((Field) term47562).setAccessible(true);
        Object enum134 = ((Field) term47562).get((Object) null);
        Class<? extends Object> term47794 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term47793 = ((Class) term47794).getDeclaredField((String) "AfterAfterBody");
        ((Field) term47793).setAccessible(true);
        Object enum135 = ((Field) term47793).get((Object) null);
        Class<? extends Object> term48028 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48027 = ((Class) term48028).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term48027).setAccessible(true);
        Object enum136 = ((Field) term48027).get((Object) null);
        Class<? extends Object> term48274 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term48273 = ((Class) term48274).getDeclaredField((String) "ForeignContent");
        ((Field) term48273).setAccessible(true);
        Object enum137 = ((Field) term48273).get((Object) null);
        term43082 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term43082, 0, enum115);
        setElement(term43082, 1, enum116);
        setElement(term43082, 2, enum117);
        setElement(term43082, 3, enum118);
        setElement(term43082, 4, enum119);
        setElement(term43082, 5, enum120);
        setElement(term43082, 6, enum121);
        setElement(term43082, 7, enum122);
        setElement(term43082, 8, enum123);
        setElement(term43082, 9, enum124);
        setElement(term43082, 10, enum125);
        setElement(term43082, 11, enum126);
        setElement(term43082, 12, enum127);
        setElement(term43082, 13, enum128);
        setElement(term43082, 14, enum129);
        setElement(term43082, 15, enum130);
        setElement(term43082, 16, enum131);
        setElement(term43082, 17, enum132);
        setElement(term43082, 18, enum133);
        setElement(term43082, 19, enum134);
        setElement(term43082, 20, enum135);
        setElement(term43082, 21, enum136);
        setElement(term43082, 22, enum137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term43082));
    }

};


