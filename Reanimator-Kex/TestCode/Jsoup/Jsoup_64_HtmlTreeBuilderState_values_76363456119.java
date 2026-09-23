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

public class HtmlTreeBuilderState_values_76363456119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17201;

    public HtmlTreeBuilderState_values_76363456119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17524 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term17523 = ((Class) term17524).getDeclaredField((String) "Initial");
        ((Field) term17523).setAccessible(true);
        Object enum46 = ((Field) term17523).get((Object) null);
        Class<? extends Object> term17737 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term17736 = ((Class) term17737).getDeclaredField((String) "BeforeHtml");
        ((Field) term17736).setAccessible(true);
        Object enum47 = ((Field) term17736).get((Object) null);
        Class<? extends Object> term17959 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term17958 = ((Class) term17959).getDeclaredField((String) "BeforeHead");
        ((Field) term17958).setAccessible(true);
        Object enum48 = ((Field) term17958).get((Object) null);
        Class<? extends Object> term18181 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term18180 = ((Class) term18181).getDeclaredField((String) "InHead");
        ((Field) term18180).setAccessible(true);
        Object enum49 = ((Field) term18180).get((Object) null);
        Class<? extends Object> term18391 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term18390 = ((Class) term18391).getDeclaredField((String) "InHeadNoscript");
        ((Field) term18390).setAccessible(true);
        Object enum50 = ((Field) term18390).get((Object) null);
        Class<? extends Object> term18625 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term18624 = ((Class) term18625).getDeclaredField((String) "AfterHead");
        ((Field) term18624).setAccessible(true);
        Object enum51 = ((Field) term18624).get((Object) null);
        Class<? extends Object> term18844 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term18843 = ((Class) term18844).getDeclaredField((String) "InBody");
        ((Field) term18843).setAccessible(true);
        Object enum52 = ((Field) term18843).get((Object) null);
        Class<? extends Object> term19054 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19053 = ((Class) term19054).getDeclaredField((String) "Text");
        ((Field) term19053).setAccessible(true);
        Object enum53 = ((Field) term19053).get((Object) null);
        Class<? extends Object> term19258 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19257 = ((Class) term19258).getDeclaredField((String) "InTable");
        ((Field) term19257).setAccessible(true);
        Object enum54 = ((Field) term19257).get((Object) null);
        Class<? extends Object> term19471 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19470 = ((Class) term19471).getDeclaredField((String) "InTableText");
        ((Field) term19470).setAccessible(true);
        Object enum55 = ((Field) term19470).get((Object) null);
        Class<? extends Object> term19696 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19695 = ((Class) term19696).getDeclaredField((String) "InCaption");
        ((Field) term19695).setAccessible(true);
        Object enum56 = ((Field) term19695).get((Object) null);
        Class<? extends Object> term19915 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19914 = ((Class) term19915).getDeclaredField((String) "InColumnGroup");
        ((Field) term19914).setAccessible(true);
        Object enum57 = ((Field) term19914).get((Object) null);
        Class<? extends Object> term20146 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20145 = ((Class) term20146).getDeclaredField((String) "InTableBody");
        ((Field) term20145).setAccessible(true);
        Object enum58 = ((Field) term20145).get((Object) null);
        Class<? extends Object> term20371 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20370 = ((Class) term20371).getDeclaredField((String) "InRow");
        ((Field) term20370).setAccessible(true);
        Object enum59 = ((Field) term20370).get((Object) null);
        Class<? extends Object> term20578 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20577 = ((Class) term20578).getDeclaredField((String) "InCell");
        ((Field) term20577).setAccessible(true);
        Object enum60 = ((Field) term20577).get((Object) null);
        Class<? extends Object> term20788 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20787 = ((Class) term20788).getDeclaredField((String) "InSelect");
        ((Field) term20787).setAccessible(true);
        Object enum61 = ((Field) term20787).get((Object) null);
        Class<? extends Object> term21004 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21003 = ((Class) term21004).getDeclaredField((String) "InSelectInTable");
        ((Field) term21003).setAccessible(true);
        Object enum62 = ((Field) term21003).get((Object) null);
        Class<? extends Object> term21241 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21240 = ((Class) term21241).getDeclaredField((String) "AfterBody");
        ((Field) term21240).setAccessible(true);
        Object enum63 = ((Field) term21240).get((Object) null);
        Class<? extends Object> term21460 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21459 = ((Class) term21460).getDeclaredField((String) "InFrameset");
        ((Field) term21459).setAccessible(true);
        Object enum64 = ((Field) term21459).get((Object) null);
        Class<? extends Object> term21684 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21683 = ((Class) term21684).getDeclaredField((String) "AfterFrameset");
        ((Field) term21683).setAccessible(true);
        Object enum65 = ((Field) term21683).get((Object) null);
        Class<? extends Object> term21980 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21979 = ((Class) term21980).getDeclaredField((String) "AfterAfterBody");
        ((Field) term21979).setAccessible(true);
        Object enum66 = ((Field) term21979).get((Object) null);
        Class<? extends Object> term22214 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22213 = ((Class) term22214).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term22213).setAccessible(true);
        Object enum67 = ((Field) term22213).get((Object) null);
        Class<? extends Object> term22460 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22459 = ((Class) term22460).getDeclaredField((String) "ForeignContent");
        ((Field) term22459).setAccessible(true);
        Object enum68 = ((Field) term22459).get((Object) null);
        term17201 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term17201, 0, enum46);
        setElement(term17201, 1, enum47);
        setElement(term17201, 2, enum48);
        setElement(term17201, 3, enum49);
        setElement(term17201, 4, enum50);
        setElement(term17201, 5, enum51);
        setElement(term17201, 6, enum52);
        setElement(term17201, 7, enum53);
        setElement(term17201, 8, enum54);
        setElement(term17201, 9, enum55);
        setElement(term17201, 10, enum56);
        setElement(term17201, 11, enum57);
        setElement(term17201, 12, enum58);
        setElement(term17201, 13, enum59);
        setElement(term17201, 14, enum60);
        setElement(term17201, 15, enum61);
        setElement(term17201, 16, enum62);
        setElement(term17201, 17, enum63);
        setElement(term17201, 18, enum64);
        setElement(term17201, 19, enum65);
        setElement(term17201, 20, enum66);
        setElement(term17201, 21, enum67);
        setElement(term17201, 22, enum68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term17201));
    }

};


