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

public class HtmlTreeBuilderState_values_7636345615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6760;

    public HtmlTreeBuilderState_values_7636345615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7083 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7082 = ((Class) term7083).getDeclaredField((String) "Initial");
        ((Field) term7082).setAccessible(true);
        Object enum14 = ((Field) term7082).get((Object) null);
        Class<? extends Object> term7296 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7295 = ((Class) term7296).getDeclaredField((String) "BeforeHtml");
        ((Field) term7295).setAccessible(true);
        Object enum15 = ((Field) term7295).get((Object) null);
        Class<? extends Object> term7518 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7517 = ((Class) term7518).getDeclaredField((String) "BeforeHead");
        ((Field) term7517).setAccessible(true);
        Object enum16 = ((Field) term7517).get((Object) null);
        Class<? extends Object> term7740 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7739 = ((Class) term7740).getDeclaredField((String) "InHead");
        ((Field) term7739).setAccessible(true);
        Object enum17 = ((Field) term7739).get((Object) null);
        Class<? extends Object> term7950 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7949 = ((Class) term7950).getDeclaredField((String) "InHeadNoscript");
        ((Field) term7949).setAccessible(true);
        Object enum18 = ((Field) term7949).get((Object) null);
        Class<? extends Object> term8184 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8183 = ((Class) term8184).getDeclaredField((String) "AfterHead");
        ((Field) term8183).setAccessible(true);
        Object enum19 = ((Field) term8183).get((Object) null);
        Class<? extends Object> term8403 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8402 = ((Class) term8403).getDeclaredField((String) "InBody");
        ((Field) term8402).setAccessible(true);
        Object enum20 = ((Field) term8402).get((Object) null);
        Class<? extends Object> term8613 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8612 = ((Class) term8613).getDeclaredField((String) "Text");
        ((Field) term8612).setAccessible(true);
        Object enum21 = ((Field) term8612).get((Object) null);
        Class<? extends Object> term8817 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8816 = ((Class) term8817).getDeclaredField((String) "InTable");
        ((Field) term8816).setAccessible(true);
        Object enum22 = ((Field) term8816).get((Object) null);
        Class<? extends Object> term9030 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9029 = ((Class) term9030).getDeclaredField((String) "InTableText");
        ((Field) term9029).setAccessible(true);
        Object enum23 = ((Field) term9029).get((Object) null);
        Class<? extends Object> term9255 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9254 = ((Class) term9255).getDeclaredField((String) "InCaption");
        ((Field) term9254).setAccessible(true);
        Object enum24 = ((Field) term9254).get((Object) null);
        Class<? extends Object> term9474 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9473 = ((Class) term9474).getDeclaredField((String) "InColumnGroup");
        ((Field) term9473).setAccessible(true);
        Object enum25 = ((Field) term9473).get((Object) null);
        Class<? extends Object> term9705 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9704 = ((Class) term9705).getDeclaredField((String) "InTableBody");
        ((Field) term9704).setAccessible(true);
        Object enum26 = ((Field) term9704).get((Object) null);
        Class<? extends Object> term9930 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9929 = ((Class) term9930).getDeclaredField((String) "InRow");
        ((Field) term9929).setAccessible(true);
        Object enum27 = ((Field) term9929).get((Object) null);
        Class<? extends Object> term10137 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10136 = ((Class) term10137).getDeclaredField((String) "InCell");
        ((Field) term10136).setAccessible(true);
        Object enum28 = ((Field) term10136).get((Object) null);
        Class<? extends Object> term10347 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10346 = ((Class) term10347).getDeclaredField((String) "InSelect");
        ((Field) term10346).setAccessible(true);
        Object enum29 = ((Field) term10346).get((Object) null);
        Class<? extends Object> term10563 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10562 = ((Class) term10563).getDeclaredField((String) "InSelectInTable");
        ((Field) term10562).setAccessible(true);
        Object enum30 = ((Field) term10562).get((Object) null);
        Class<? extends Object> term10800 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10799 = ((Class) term10800).getDeclaredField((String) "AfterBody");
        ((Field) term10799).setAccessible(true);
        Object enum31 = ((Field) term10799).get((Object) null);
        Class<? extends Object> term11019 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11018 = ((Class) term11019).getDeclaredField((String) "InFrameset");
        ((Field) term11018).setAccessible(true);
        Object enum32 = ((Field) term11018).get((Object) null);
        Class<? extends Object> term11241 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11240 = ((Class) term11241).getDeclaredField((String) "AfterFrameset");
        ((Field) term11240).setAccessible(true);
        Object enum33 = ((Field) term11240).get((Object) null);
        Class<? extends Object> term11472 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11471 = ((Class) term11472).getDeclaredField((String) "AfterAfterBody");
        ((Field) term11471).setAccessible(true);
        Object enum34 = ((Field) term11471).get((Object) null);
        Class<? extends Object> term11706 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11705 = ((Class) term11706).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term11705).setAccessible(true);
        Object enum35 = ((Field) term11705).get((Object) null);
        Class<? extends Object> term11952 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11951 = ((Class) term11952).getDeclaredField((String) "ForeignContent");
        ((Field) term11951).setAccessible(true);
        Object enum36 = ((Field) term11951).get((Object) null);
        term6760 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term6760, 0, enum14);
        setElement(term6760, 1, enum15);
        setElement(term6760, 2, enum16);
        setElement(term6760, 3, enum17);
        setElement(term6760, 4, enum18);
        setElement(term6760, 5, enum19);
        setElement(term6760, 6, enum20);
        setElement(term6760, 7, enum21);
        setElement(term6760, 8, enum22);
        setElement(term6760, 9, enum23);
        setElement(term6760, 10, enum24);
        setElement(term6760, 11, enum25);
        setElement(term6760, 12, enum26);
        setElement(term6760, 13, enum27);
        setElement(term6760, 14, enum28);
        setElement(term6760, 15, enum29);
        setElement(term6760, 16, enum30);
        setElement(term6760, 17, enum31);
        setElement(term6760, 18, enum32);
        setElement(term6760, 19, enum33);
        setElement(term6760, 20, enum34);
        setElement(term6760, 21, enum35);
        setElement(term6760, 22, enum36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term6760));
    }

};


