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

public class HtmlTreeBuilderState_values_7636345616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3420;

    public HtmlTreeBuilderState_values_7636345616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3743 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term3742 = ((Class) term3743).getDeclaredField((String) "Initial");
        ((Field) term3742).setAccessible(true);
        Object enum8 = ((Field) term3742).get((Object) null);
        Class<? extends Object> term3956 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term3955 = ((Class) term3956).getDeclaredField((String) "BeforeHtml");
        ((Field) term3955).setAccessible(true);
        Object enum9 = ((Field) term3955).get((Object) null);
        Class<? extends Object> term4178 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4177 = ((Class) term4178).getDeclaredField((String) "BeforeHead");
        ((Field) term4177).setAccessible(true);
        Object enum10 = ((Field) term4177).get((Object) null);
        Class<? extends Object> term4400 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4399 = ((Class) term4400).getDeclaredField((String) "InHead");
        ((Field) term4399).setAccessible(true);
        Object enum11 = ((Field) term4399).get((Object) null);
        Class<? extends Object> term4610 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4609 = ((Class) term4610).getDeclaredField((String) "InHeadNoscript");
        ((Field) term4609).setAccessible(true);
        Object enum12 = ((Field) term4609).get((Object) null);
        Class<? extends Object> term4844 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4843 = ((Class) term4844).getDeclaredField((String) "AfterHead");
        ((Field) term4843).setAccessible(true);
        Object enum13 = ((Field) term4843).get((Object) null);
        Class<? extends Object> term5063 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5062 = ((Class) term5063).getDeclaredField((String) "InBody");
        ((Field) term5062).setAccessible(true);
        Object enum14 = ((Field) term5062).get((Object) null);
        Class<? extends Object> term5273 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5272 = ((Class) term5273).getDeclaredField((String) "Text");
        ((Field) term5272).setAccessible(true);
        Object enum15 = ((Field) term5272).get((Object) null);
        Class<? extends Object> term5477 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5476 = ((Class) term5477).getDeclaredField((String) "InTable");
        ((Field) term5476).setAccessible(true);
        Object enum16 = ((Field) term5476).get((Object) null);
        Class<? extends Object> term5690 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5689 = ((Class) term5690).getDeclaredField((String) "InTableText");
        ((Field) term5689).setAccessible(true);
        Object enum17 = ((Field) term5689).get((Object) null);
        Class<? extends Object> term5915 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5914 = ((Class) term5915).getDeclaredField((String) "InCaption");
        ((Field) term5914).setAccessible(true);
        Object enum18 = ((Field) term5914).get((Object) null);
        Class<? extends Object> term6134 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6133 = ((Class) term6134).getDeclaredField((String) "InColumnGroup");
        ((Field) term6133).setAccessible(true);
        Object enum19 = ((Field) term6133).get((Object) null);
        Class<? extends Object> term6365 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6364 = ((Class) term6365).getDeclaredField((String) "InTableBody");
        ((Field) term6364).setAccessible(true);
        Object enum20 = ((Field) term6364).get((Object) null);
        Class<? extends Object> term6590 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6589 = ((Class) term6590).getDeclaredField((String) "InRow");
        ((Field) term6589).setAccessible(true);
        Object enum21 = ((Field) term6589).get((Object) null);
        Class<? extends Object> term6797 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6796 = ((Class) term6797).getDeclaredField((String) "InCell");
        ((Field) term6796).setAccessible(true);
        Object enum22 = ((Field) term6796).get((Object) null);
        Class<? extends Object> term7007 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7006 = ((Class) term7007).getDeclaredField((String) "InSelect");
        ((Field) term7006).setAccessible(true);
        Object enum23 = ((Field) term7006).get((Object) null);
        Class<? extends Object> term7223 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7222 = ((Class) term7223).getDeclaredField((String) "InSelectInTable");
        ((Field) term7222).setAccessible(true);
        Object enum24 = ((Field) term7222).get((Object) null);
        Class<? extends Object> term7460 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7459 = ((Class) term7460).getDeclaredField((String) "AfterBody");
        ((Field) term7459).setAccessible(true);
        Object enum25 = ((Field) term7459).get((Object) null);
        Class<? extends Object> term7679 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7678 = ((Class) term7679).getDeclaredField((String) "InFrameset");
        ((Field) term7678).setAccessible(true);
        Object enum26 = ((Field) term7678).get((Object) null);
        Class<? extends Object> term7901 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7900 = ((Class) term7901).getDeclaredField((String) "AfterFrameset");
        ((Field) term7900).setAccessible(true);
        Object enum27 = ((Field) term7900).get((Object) null);
        Class<? extends Object> term8132 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8131 = ((Class) term8132).getDeclaredField((String) "AfterAfterBody");
        ((Field) term8131).setAccessible(true);
        Object enum28 = ((Field) term8131).get((Object) null);
        Class<? extends Object> term8366 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8365 = ((Class) term8366).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term8365).setAccessible(true);
        Object enum29 = ((Field) term8365).get((Object) null);
        Class<? extends Object> term8612 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8611 = ((Class) term8612).getDeclaredField((String) "ForeignContent");
        ((Field) term8611).setAccessible(true);
        Object enum30 = ((Field) term8611).get((Object) null);
        term3420 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term3420, 0, enum8);
        setElement(term3420, 1, enum9);
        setElement(term3420, 2, enum10);
        setElement(term3420, 3, enum11);
        setElement(term3420, 4, enum12);
        setElement(term3420, 5, enum13);
        setElement(term3420, 6, enum14);
        setElement(term3420, 7, enum15);
        setElement(term3420, 8, enum16);
        setElement(term3420, 9, enum17);
        setElement(term3420, 10, enum18);
        setElement(term3420, 11, enum19);
        setElement(term3420, 12, enum20);
        setElement(term3420, 13, enum21);
        setElement(term3420, 14, enum22);
        setElement(term3420, 15, enum23);
        setElement(term3420, 16, enum24);
        setElement(term3420, 17, enum25);
        setElement(term3420, 18, enum26);
        setElement(term3420, 19, enum27);
        setElement(term3420, 20, enum28);
        setElement(term3420, 21, enum29);
        setElement(term3420, 22, enum30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3420));
    }

};


