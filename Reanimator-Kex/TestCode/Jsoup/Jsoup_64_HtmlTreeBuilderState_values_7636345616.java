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
     Object term3272;

    public HtmlTreeBuilderState_values_7636345616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3595 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term3594 = ((Class) term3595).getDeclaredField((String) "Initial");
        ((Field) term3594).setAccessible(true);
        Object enum8 = ((Field) term3594).get((Object) null);
        Class<? extends Object> term3808 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term3807 = ((Class) term3808).getDeclaredField((String) "BeforeHtml");
        ((Field) term3807).setAccessible(true);
        Object enum9 = ((Field) term3807).get((Object) null);
        Class<? extends Object> term4030 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4029 = ((Class) term4030).getDeclaredField((String) "BeforeHead");
        ((Field) term4029).setAccessible(true);
        Object enum10 = ((Field) term4029).get((Object) null);
        Class<? extends Object> term4252 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4251 = ((Class) term4252).getDeclaredField((String) "InHead");
        ((Field) term4251).setAccessible(true);
        Object enum11 = ((Field) term4251).get((Object) null);
        Class<? extends Object> term4462 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4461 = ((Class) term4462).getDeclaredField((String) "InHeadNoscript");
        ((Field) term4461).setAccessible(true);
        Object enum12 = ((Field) term4461).get((Object) null);
        Class<? extends Object> term4696 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4695 = ((Class) term4696).getDeclaredField((String) "AfterHead");
        ((Field) term4695).setAccessible(true);
        Object enum13 = ((Field) term4695).get((Object) null);
        Class<? extends Object> term4915 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4914 = ((Class) term4915).getDeclaredField((String) "InBody");
        ((Field) term4914).setAccessible(true);
        Object enum14 = ((Field) term4914).get((Object) null);
        Class<? extends Object> term5125 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5124 = ((Class) term5125).getDeclaredField((String) "Text");
        ((Field) term5124).setAccessible(true);
        Object enum15 = ((Field) term5124).get((Object) null);
        Class<? extends Object> term5329 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5328 = ((Class) term5329).getDeclaredField((String) "InTable");
        ((Field) term5328).setAccessible(true);
        Object enum16 = ((Field) term5328).get((Object) null);
        Class<? extends Object> term5542 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5541 = ((Class) term5542).getDeclaredField((String) "InTableText");
        ((Field) term5541).setAccessible(true);
        Object enum17 = ((Field) term5541).get((Object) null);
        Class<? extends Object> term5767 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5766 = ((Class) term5767).getDeclaredField((String) "InCaption");
        ((Field) term5766).setAccessible(true);
        Object enum18 = ((Field) term5766).get((Object) null);
        Class<? extends Object> term5986 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5985 = ((Class) term5986).getDeclaredField((String) "InColumnGroup");
        ((Field) term5985).setAccessible(true);
        Object enum19 = ((Field) term5985).get((Object) null);
        Class<? extends Object> term6217 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6216 = ((Class) term6217).getDeclaredField((String) "InTableBody");
        ((Field) term6216).setAccessible(true);
        Object enum20 = ((Field) term6216).get((Object) null);
        Class<? extends Object> term6442 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6441 = ((Class) term6442).getDeclaredField((String) "InRow");
        ((Field) term6441).setAccessible(true);
        Object enum21 = ((Field) term6441).get((Object) null);
        Class<? extends Object> term6649 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6648 = ((Class) term6649).getDeclaredField((String) "InCell");
        ((Field) term6648).setAccessible(true);
        Object enum22 = ((Field) term6648).get((Object) null);
        Class<? extends Object> term6859 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6858 = ((Class) term6859).getDeclaredField((String) "InSelect");
        ((Field) term6858).setAccessible(true);
        Object enum23 = ((Field) term6858).get((Object) null);
        Class<? extends Object> term7075 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7074 = ((Class) term7075).getDeclaredField((String) "InSelectInTable");
        ((Field) term7074).setAccessible(true);
        Object enum24 = ((Field) term7074).get((Object) null);
        Class<? extends Object> term7312 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7311 = ((Class) term7312).getDeclaredField((String) "AfterBody");
        ((Field) term7311).setAccessible(true);
        Object enum25 = ((Field) term7311).get((Object) null);
        Class<? extends Object> term7531 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7530 = ((Class) term7531).getDeclaredField((String) "InFrameset");
        ((Field) term7530).setAccessible(true);
        Object enum26 = ((Field) term7530).get((Object) null);
        Class<? extends Object> term7753 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7752 = ((Class) term7753).getDeclaredField((String) "AfterFrameset");
        ((Field) term7752).setAccessible(true);
        Object enum27 = ((Field) term7752).get((Object) null);
        Class<? extends Object> term7984 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7983 = ((Class) term7984).getDeclaredField((String) "AfterAfterBody");
        ((Field) term7983).setAccessible(true);
        Object enum28 = ((Field) term7983).get((Object) null);
        Class<? extends Object> term8218 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8217 = ((Class) term8218).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term8217).setAccessible(true);
        Object enum29 = ((Field) term8217).get((Object) null);
        Class<? extends Object> term8464 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8463 = ((Class) term8464).getDeclaredField((String) "ForeignContent");
        ((Field) term8463).setAccessible(true);
        Object enum30 = ((Field) term8463).get((Object) null);
        term3272 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term3272, 0, enum8);
        setElement(term3272, 1, enum9);
        setElement(term3272, 2, enum10);
        setElement(term3272, 3, enum11);
        setElement(term3272, 4, enum12);
        setElement(term3272, 5, enum13);
        setElement(term3272, 6, enum14);
        setElement(term3272, 7, enum15);
        setElement(term3272, 8, enum16);
        setElement(term3272, 9, enum17);
        setElement(term3272, 10, enum18);
        setElement(term3272, 11, enum19);
        setElement(term3272, 12, enum20);
        setElement(term3272, 13, enum21);
        setElement(term3272, 14, enum22);
        setElement(term3272, 15, enum23);
        setElement(term3272, 16, enum24);
        setElement(term3272, 17, enum25);
        setElement(term3272, 18, enum26);
        setElement(term3272, 19, enum27);
        setElement(term3272, 20, enum28);
        setElement(term3272, 21, enum29);
        setElement(term3272, 22, enum30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3272));
    }

};


