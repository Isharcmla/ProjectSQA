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
     Object term6716;

    public HtmlTreeBuilderState_values_7636345615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7039 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7038 = ((Class) term7039).getDeclaredField((String) "Initial");
        ((Field) term7038).setAccessible(true);
        Object enum14 = ((Field) term7038).get((Object) null);
        Class<? extends Object> term7252 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7251 = ((Class) term7252).getDeclaredField((String) "BeforeHtml");
        ((Field) term7251).setAccessible(true);
        Object enum15 = ((Field) term7251).get((Object) null);
        Class<? extends Object> term7474 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7473 = ((Class) term7474).getDeclaredField((String) "BeforeHead");
        ((Field) term7473).setAccessible(true);
        Object enum16 = ((Field) term7473).get((Object) null);
        Class<? extends Object> term7696 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7695 = ((Class) term7696).getDeclaredField((String) "InHead");
        ((Field) term7695).setAccessible(true);
        Object enum17 = ((Field) term7695).get((Object) null);
        Class<? extends Object> term7906 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term7905 = ((Class) term7906).getDeclaredField((String) "InHeadNoscript");
        ((Field) term7905).setAccessible(true);
        Object enum18 = ((Field) term7905).get((Object) null);
        Class<? extends Object> term8140 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8139 = ((Class) term8140).getDeclaredField((String) "AfterHead");
        ((Field) term8139).setAccessible(true);
        Object enum19 = ((Field) term8139).get((Object) null);
        Class<? extends Object> term8359 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8358 = ((Class) term8359).getDeclaredField((String) "InBody");
        ((Field) term8358).setAccessible(true);
        Object enum20 = ((Field) term8358).get((Object) null);
        Class<? extends Object> term8569 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8568 = ((Class) term8569).getDeclaredField((String) "Text");
        ((Field) term8568).setAccessible(true);
        Object enum21 = ((Field) term8568).get((Object) null);
        Class<? extends Object> term8773 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8772 = ((Class) term8773).getDeclaredField((String) "InTable");
        ((Field) term8772).setAccessible(true);
        Object enum22 = ((Field) term8772).get((Object) null);
        Class<? extends Object> term8986 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term8985 = ((Class) term8986).getDeclaredField((String) "InTableText");
        ((Field) term8985).setAccessible(true);
        Object enum23 = ((Field) term8985).get((Object) null);
        Class<? extends Object> term9211 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9210 = ((Class) term9211).getDeclaredField((String) "InCaption");
        ((Field) term9210).setAccessible(true);
        Object enum24 = ((Field) term9210).get((Object) null);
        Class<? extends Object> term9430 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9429 = ((Class) term9430).getDeclaredField((String) "InColumnGroup");
        ((Field) term9429).setAccessible(true);
        Object enum25 = ((Field) term9429).get((Object) null);
        Class<? extends Object> term9661 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9660 = ((Class) term9661).getDeclaredField((String) "InTableBody");
        ((Field) term9660).setAccessible(true);
        Object enum26 = ((Field) term9660).get((Object) null);
        Class<? extends Object> term9886 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9885 = ((Class) term9886).getDeclaredField((String) "InRow");
        ((Field) term9885).setAccessible(true);
        Object enum27 = ((Field) term9885).get((Object) null);
        Class<? extends Object> term10093 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10092 = ((Class) term10093).getDeclaredField((String) "InCell");
        ((Field) term10092).setAccessible(true);
        Object enum28 = ((Field) term10092).get((Object) null);
        Class<? extends Object> term10303 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10302 = ((Class) term10303).getDeclaredField((String) "InSelect");
        ((Field) term10302).setAccessible(true);
        Object enum29 = ((Field) term10302).get((Object) null);
        Class<? extends Object> term10519 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10518 = ((Class) term10519).getDeclaredField((String) "InSelectInTable");
        ((Field) term10518).setAccessible(true);
        Object enum30 = ((Field) term10518).get((Object) null);
        Class<? extends Object> term10756 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10755 = ((Class) term10756).getDeclaredField((String) "AfterBody");
        ((Field) term10755).setAccessible(true);
        Object enum31 = ((Field) term10755).get((Object) null);
        Class<? extends Object> term10975 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10974 = ((Class) term10975).getDeclaredField((String) "InFrameset");
        ((Field) term10974).setAccessible(true);
        Object enum32 = ((Field) term10974).get((Object) null);
        Class<? extends Object> term11197 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11196 = ((Class) term11197).getDeclaredField((String) "AfterFrameset");
        ((Field) term11196).setAccessible(true);
        Object enum33 = ((Field) term11196).get((Object) null);
        Class<? extends Object> term11428 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11427 = ((Class) term11428).getDeclaredField((String) "AfterAfterBody");
        ((Field) term11427).setAccessible(true);
        Object enum34 = ((Field) term11427).get((Object) null);
        Class<? extends Object> term11662 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11661 = ((Class) term11662).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term11661).setAccessible(true);
        Object enum35 = ((Field) term11661).get((Object) null);
        Class<? extends Object> term11908 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11907 = ((Class) term11908).getDeclaredField((String) "ForeignContent");
        ((Field) term11907).setAccessible(true);
        Object enum36 = ((Field) term11907).get((Object) null);
        term6716 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term6716, 0, enum14);
        setElement(term6716, 1, enum15);
        setElement(term6716, 2, enum16);
        setElement(term6716, 3, enum17);
        setElement(term6716, 4, enum18);
        setElement(term6716, 5, enum19);
        setElement(term6716, 6, enum20);
        setElement(term6716, 7, enum21);
        setElement(term6716, 8, enum22);
        setElement(term6716, 9, enum23);
        setElement(term6716, 10, enum24);
        setElement(term6716, 11, enum25);
        setElement(term6716, 12, enum26);
        setElement(term6716, 13, enum27);
        setElement(term6716, 14, enum28);
        setElement(term6716, 15, enum29);
        setElement(term6716, 16, enum30);
        setElement(term6716, 17, enum31);
        setElement(term6716, 18, enum32);
        setElement(term6716, 19, enum33);
        setElement(term6716, 20, enum34);
        setElement(term6716, 21, enum35);
        setElement(term6716, 22, enum36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term6716));
    }

};


