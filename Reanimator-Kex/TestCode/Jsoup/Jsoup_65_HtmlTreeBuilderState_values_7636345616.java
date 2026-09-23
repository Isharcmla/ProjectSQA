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
     Object term3418;

    public HtmlTreeBuilderState_values_7636345616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3741 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term3740 = ((Class) term3741).getDeclaredField((String) "Initial");
        ((Field) term3740).setAccessible(true);
        Object enum8 = ((Field) term3740).get((Object) null);
        Class<? extends Object> term3954 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term3953 = ((Class) term3954).getDeclaredField((String) "BeforeHtml");
        ((Field) term3953).setAccessible(true);
        Object enum9 = ((Field) term3953).get((Object) null);
        Class<? extends Object> term4176 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4175 = ((Class) term4176).getDeclaredField((String) "BeforeHead");
        ((Field) term4175).setAccessible(true);
        Object enum10 = ((Field) term4175).get((Object) null);
        Class<? extends Object> term4398 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4397 = ((Class) term4398).getDeclaredField((String) "InHead");
        ((Field) term4397).setAccessible(true);
        Object enum11 = ((Field) term4397).get((Object) null);
        Class<? extends Object> term4608 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4607 = ((Class) term4608).getDeclaredField((String) "InHeadNoscript");
        ((Field) term4607).setAccessible(true);
        Object enum12 = ((Field) term4607).get((Object) null);
        Class<? extends Object> term4842 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4841 = ((Class) term4842).getDeclaredField((String) "AfterHead");
        ((Field) term4841).setAccessible(true);
        Object enum13 = ((Field) term4841).get((Object) null);
        Class<? extends Object> term5061 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5060 = ((Class) term5061).getDeclaredField((String) "InBody");
        ((Field) term5060).setAccessible(true);
        Object enum14 = ((Field) term5060).get((Object) null);
        Class<? extends Object> term5271 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5270 = ((Class) term5271).getDeclaredField((String) "Text");
        ((Field) term5270).setAccessible(true);
        Object enum15 = ((Field) term5270).get((Object) null);
        Class<? extends Object> term5475 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5474 = ((Class) term5475).getDeclaredField((String) "InTable");
        ((Field) term5474).setAccessible(true);
        Object enum16 = ((Field) term5474).get((Object) null);
        Class<? extends Object> term5688 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5687 = ((Class) term5688).getDeclaredField((String) "InTableText");
        ((Field) term5687).setAccessible(true);
        Object enum17 = ((Field) term5687).get((Object) null);
        Class<? extends Object> term5913 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5912 = ((Class) term5913).getDeclaredField((String) "InCaption");
        ((Field) term5912).setAccessible(true);
        Object enum18 = ((Field) term5912).get((Object) null);
        Class<? extends Object> term6132 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6131 = ((Class) term6132).getDeclaredField((String) "InColumnGroup");
        ((Field) term6131).setAccessible(true);
        Object enum19 = ((Field) term6131).get((Object) null);
        Class<? extends Object> term6363 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6362 = ((Class) term6363).getDeclaredField((String) "InTableBody");
        ((Field) term6362).setAccessible(true);
        Object enum20 = ((Field) term6362).get((Object) null);
        Class<? extends Object> term6588 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6587 = ((Class) term6588).getDeclaredField((String) "InRow");
        ((Field) term6587).setAccessible(true);
        Object enum21 = ((Field) term6587).get((Object) null);
        Class<? extends Object> term6795 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6794 = ((Class) term6795).getDeclaredField((String) "InCell");
        ((Field) term6794).setAccessible(true);
        Object enum22 = ((Field) term6794).get((Object) null);
        Class<? extends Object> term7005 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7004 = ((Class) term7005).getDeclaredField((String) "InSelect");
        ((Field) term7004).setAccessible(true);
        Object enum23 = ((Field) term7004).get((Object) null);
        Class<? extends Object> term7221 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7220 = ((Class) term7221).getDeclaredField((String) "InSelectInTable");
        ((Field) term7220).setAccessible(true);
        Object enum24 = ((Field) term7220).get((Object) null);
        Class<? extends Object> term7458 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7457 = ((Class) term7458).getDeclaredField((String) "AfterBody");
        ((Field) term7457).setAccessible(true);
        Object enum25 = ((Field) term7457).get((Object) null);
        Class<? extends Object> term7677 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7676 = ((Class) term7677).getDeclaredField((String) "InFrameset");
        ((Field) term7676).setAccessible(true);
        Object enum26 = ((Field) term7676).get((Object) null);
        Class<? extends Object> term7899 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7898 = ((Class) term7899).getDeclaredField((String) "AfterFrameset");
        ((Field) term7898).setAccessible(true);
        Object enum27 = ((Field) term7898).get((Object) null);
        Class<? extends Object> term8130 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8129 = ((Class) term8130).getDeclaredField((String) "AfterAfterBody");
        ((Field) term8129).setAccessible(true);
        Object enum28 = ((Field) term8129).get((Object) null);
        Class<? extends Object> term8364 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8363 = ((Class) term8364).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term8363).setAccessible(true);
        Object enum29 = ((Field) term8363).get((Object) null);
        Class<? extends Object> term8610 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8609 = ((Class) term8610).getDeclaredField((String) "ForeignContent");
        ((Field) term8609).setAccessible(true);
        Object enum30 = ((Field) term8609).get((Object) null);
        term3418 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term3418, 0, enum8);
        setElement(term3418, 1, enum9);
        setElement(term3418, 2, enum10);
        setElement(term3418, 3, enum11);
        setElement(term3418, 4, enum12);
        setElement(term3418, 5, enum13);
        setElement(term3418, 6, enum14);
        setElement(term3418, 7, enum15);
        setElement(term3418, 8, enum16);
        setElement(term3418, 9, enum17);
        setElement(term3418, 10, enum18);
        setElement(term3418, 11, enum19);
        setElement(term3418, 12, enum20);
        setElement(term3418, 13, enum21);
        setElement(term3418, 14, enum22);
        setElement(term3418, 15, enum23);
        setElement(term3418, 16, enum24);
        setElement(term3418, 17, enum25);
        setElement(term3418, 18, enum26);
        setElement(term3418, 19, enum27);
        setElement(term3418, 20, enum28);
        setElement(term3418, 21, enum29);
        setElement(term3418, 22, enum30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3418));
    }

};


