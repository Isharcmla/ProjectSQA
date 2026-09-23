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
     Object term3114;

    public HtmlTreeBuilderState_values_7636345616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3437 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term3436 = ((Class) term3437).getDeclaredField((String) "Initial");
        ((Field) term3436).setAccessible(true);
        Object enum8 = ((Field) term3436).get((Object) null);
        Class<? extends Object> term3650 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term3649 = ((Class) term3650).getDeclaredField((String) "BeforeHtml");
        ((Field) term3649).setAccessible(true);
        Object enum9 = ((Field) term3649).get((Object) null);
        Class<? extends Object> term3872 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term3871 = ((Class) term3872).getDeclaredField((String) "BeforeHead");
        ((Field) term3871).setAccessible(true);
        Object enum10 = ((Field) term3871).get((Object) null);
        Class<? extends Object> term4094 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4093 = ((Class) term4094).getDeclaredField((String) "InHead");
        ((Field) term4093).setAccessible(true);
        Object enum11 = ((Field) term4093).get((Object) null);
        Class<? extends Object> term4304 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4303 = ((Class) term4304).getDeclaredField((String) "InHeadNoscript");
        ((Field) term4303).setAccessible(true);
        Object enum12 = ((Field) term4303).get((Object) null);
        Class<? extends Object> term4538 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4537 = ((Class) term4538).getDeclaredField((String) "AfterHead");
        ((Field) term4537).setAccessible(true);
        Object enum13 = ((Field) term4537).get((Object) null);
        Class<? extends Object> term4757 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4756 = ((Class) term4757).getDeclaredField((String) "InBody");
        ((Field) term4756).setAccessible(true);
        Object enum14 = ((Field) term4756).get((Object) null);
        Class<? extends Object> term4967 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term4966 = ((Class) term4967).getDeclaredField((String) "Text");
        ((Field) term4966).setAccessible(true);
        Object enum15 = ((Field) term4966).get((Object) null);
        Class<? extends Object> term5171 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5170 = ((Class) term5171).getDeclaredField((String) "InTable");
        ((Field) term5170).setAccessible(true);
        Object enum16 = ((Field) term5170).get((Object) null);
        Class<? extends Object> term5384 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5383 = ((Class) term5384).getDeclaredField((String) "InTableText");
        ((Field) term5383).setAccessible(true);
        Object enum17 = ((Field) term5383).get((Object) null);
        Class<? extends Object> term5609 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5608 = ((Class) term5609).getDeclaredField((String) "InCaption");
        ((Field) term5608).setAccessible(true);
        Object enum18 = ((Field) term5608).get((Object) null);
        Class<? extends Object> term5828 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term5827 = ((Class) term5828).getDeclaredField((String) "InColumnGroup");
        ((Field) term5827).setAccessible(true);
        Object enum19 = ((Field) term5827).get((Object) null);
        Class<? extends Object> term6059 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6058 = ((Class) term6059).getDeclaredField((String) "InTableBody");
        ((Field) term6058).setAccessible(true);
        Object enum20 = ((Field) term6058).get((Object) null);
        Class<? extends Object> term6284 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6283 = ((Class) term6284).getDeclaredField((String) "InRow");
        ((Field) term6283).setAccessible(true);
        Object enum21 = ((Field) term6283).get((Object) null);
        Class<? extends Object> term6491 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6490 = ((Class) term6491).getDeclaredField((String) "InCell");
        ((Field) term6490).setAccessible(true);
        Object enum22 = ((Field) term6490).get((Object) null);
        Class<? extends Object> term6701 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6700 = ((Class) term6701).getDeclaredField((String) "InSelect");
        ((Field) term6700).setAccessible(true);
        Object enum23 = ((Field) term6700).get((Object) null);
        Class<? extends Object> term6917 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term6916 = ((Class) term6917).getDeclaredField((String) "InSelectInTable");
        ((Field) term6916).setAccessible(true);
        Object enum24 = ((Field) term6916).get((Object) null);
        Class<? extends Object> term7154 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7153 = ((Class) term7154).getDeclaredField((String) "AfterBody");
        ((Field) term7153).setAccessible(true);
        Object enum25 = ((Field) term7153).get((Object) null);
        Class<? extends Object> term7373 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7372 = ((Class) term7373).getDeclaredField((String) "InFrameset");
        ((Field) term7372).setAccessible(true);
        Object enum26 = ((Field) term7372).get((Object) null);
        Class<? extends Object> term7595 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7594 = ((Class) term7595).getDeclaredField((String) "AfterFrameset");
        ((Field) term7594).setAccessible(true);
        Object enum27 = ((Field) term7594).get((Object) null);
        Class<? extends Object> term7826 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7825 = ((Class) term7826).getDeclaredField((String) "AfterAfterBody");
        ((Field) term7825).setAccessible(true);
        Object enum28 = ((Field) term7825).get((Object) null);
        Class<? extends Object> term8060 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8059 = ((Class) term8060).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term8059).setAccessible(true);
        Object enum29 = ((Field) term8059).get((Object) null);
        Class<? extends Object> term8306 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8305 = ((Class) term8306).getDeclaredField((String) "ForeignContent");
        ((Field) term8305).setAccessible(true);
        Object enum30 = ((Field) term8305).get((Object) null);
        term3114 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term3114, 0, enum8);
        setElement(term3114, 1, enum9);
        setElement(term3114, 2, enum10);
        setElement(term3114, 3, enum11);
        setElement(term3114, 4, enum12);
        setElement(term3114, 5, enum13);
        setElement(term3114, 6, enum14);
        setElement(term3114, 7, enum15);
        setElement(term3114, 8, enum16);
        setElement(term3114, 9, enum17);
        setElement(term3114, 10, enum18);
        setElement(term3114, 11, enum19);
        setElement(term3114, 12, enum20);
        setElement(term3114, 13, enum21);
        setElement(term3114, 14, enum22);
        setElement(term3114, 15, enum23);
        setElement(term3114, 16, enum24);
        setElement(term3114, 17, enum25);
        setElement(term3114, 18, enum26);
        setElement(term3114, 19, enum27);
        setElement(term3114, 20, enum28);
        setElement(term3114, 21, enum29);
        setElement(term3114, 22, enum30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3114));
    }

};


