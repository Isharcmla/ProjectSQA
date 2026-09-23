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
     Object term9062;

    public HtmlTreeBuilderState_values_7636345616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9385 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9384 = ((Class) term9385).getDeclaredField((String) "Initial");
        ((Field) term9384).setAccessible(true);
        Object enum20 = ((Field) term9384).get((Object) null);
        Class<? extends Object> term9598 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9597 = ((Class) term9598).getDeclaredField((String) "BeforeHtml");
        ((Field) term9597).setAccessible(true);
        Object enum21 = ((Field) term9597).get((Object) null);
        Class<? extends Object> term9820 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term9819 = ((Class) term9820).getDeclaredField((String) "BeforeHead");
        ((Field) term9819).setAccessible(true);
        Object enum22 = ((Field) term9819).get((Object) null);
        Class<? extends Object> term10042 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10041 = ((Class) term10042).getDeclaredField((String) "InHead");
        ((Field) term10041).setAccessible(true);
        Object enum23 = ((Field) term10041).get((Object) null);
        Class<? extends Object> term10252 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10251 = ((Class) term10252).getDeclaredField((String) "InHeadNoscript");
        ((Field) term10251).setAccessible(true);
        Object enum24 = ((Field) term10251).get((Object) null);
        Class<? extends Object> term10486 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10485 = ((Class) term10486).getDeclaredField((String) "AfterHead");
        ((Field) term10485).setAccessible(true);
        Object enum25 = ((Field) term10485).get((Object) null);
        Class<? extends Object> term10705 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10704 = ((Class) term10705).getDeclaredField((String) "InBody");
        ((Field) term10704).setAccessible(true);
        Object enum26 = ((Field) term10704).get((Object) null);
        Class<? extends Object> term10915 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term10914 = ((Class) term10915).getDeclaredField((String) "Text");
        ((Field) term10914).setAccessible(true);
        Object enum27 = ((Field) term10914).get((Object) null);
        Class<? extends Object> term11119 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11118 = ((Class) term11119).getDeclaredField((String) "InTable");
        ((Field) term11118).setAccessible(true);
        Object enum28 = ((Field) term11118).get((Object) null);
        Class<? extends Object> term11332 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11331 = ((Class) term11332).getDeclaredField((String) "InTableText");
        ((Field) term11331).setAccessible(true);
        Object enum29 = ((Field) term11331).get((Object) null);
        Class<? extends Object> term11557 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11556 = ((Class) term11557).getDeclaredField((String) "InCaption");
        ((Field) term11556).setAccessible(true);
        Object enum30 = ((Field) term11556).get((Object) null);
        Class<? extends Object> term11776 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term11775 = ((Class) term11776).getDeclaredField((String) "InColumnGroup");
        ((Field) term11775).setAccessible(true);
        Object enum31 = ((Field) term11775).get((Object) null);
        Class<? extends Object> term12007 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term12006 = ((Class) term12007).getDeclaredField((String) "InTableBody");
        ((Field) term12006).setAccessible(true);
        Object enum32 = ((Field) term12006).get((Object) null);
        Class<? extends Object> term12232 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term12231 = ((Class) term12232).getDeclaredField((String) "InRow");
        ((Field) term12231).setAccessible(true);
        Object enum33 = ((Field) term12231).get((Object) null);
        Class<? extends Object> term12439 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term12438 = ((Class) term12439).getDeclaredField((String) "InCell");
        ((Field) term12438).setAccessible(true);
        Object enum34 = ((Field) term12438).get((Object) null);
        Class<? extends Object> term12649 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term12648 = ((Class) term12649).getDeclaredField((String) "InSelect");
        ((Field) term12648).setAccessible(true);
        Object enum35 = ((Field) term12648).get((Object) null);
        Class<? extends Object> term12865 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term12864 = ((Class) term12865).getDeclaredField((String) "InSelectInTable");
        ((Field) term12864).setAccessible(true);
        Object enum36 = ((Field) term12864).get((Object) null);
        Class<? extends Object> term13102 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term13101 = ((Class) term13102).getDeclaredField((String) "AfterBody");
        ((Field) term13101).setAccessible(true);
        Object enum37 = ((Field) term13101).get((Object) null);
        Class<? extends Object> term13321 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term13320 = ((Class) term13321).getDeclaredField((String) "InFrameset");
        ((Field) term13320).setAccessible(true);
        Object enum38 = ((Field) term13320).get((Object) null);
        Class<? extends Object> term13543 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term13542 = ((Class) term13543).getDeclaredField((String) "AfterFrameset");
        ((Field) term13542).setAccessible(true);
        Object enum39 = ((Field) term13542).get((Object) null);
        Class<? extends Object> term13774 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term13773 = ((Class) term13774).getDeclaredField((String) "AfterAfterBody");
        ((Field) term13773).setAccessible(true);
        Object enum40 = ((Field) term13773).get((Object) null);
        Class<? extends Object> term14008 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term14007 = ((Class) term14008).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term14007).setAccessible(true);
        Object enum41 = ((Field) term14007).get((Object) null);
        Class<? extends Object> term14254 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term14253 = ((Class) term14254).getDeclaredField((String) "ForeignContent");
        ((Field) term14253).setAccessible(true);
        Object enum42 = ((Field) term14253).get((Object) null);
        term9062 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term9062, 0, enum20);
        setElement(term9062, 1, enum21);
        setElement(term9062, 2, enum22);
        setElement(term9062, 3, enum23);
        setElement(term9062, 4, enum24);
        setElement(term9062, 5, enum25);
        setElement(term9062, 6, enum26);
        setElement(term9062, 7, enum27);
        setElement(term9062, 8, enum28);
        setElement(term9062, 9, enum29);
        setElement(term9062, 10, enum30);
        setElement(term9062, 11, enum31);
        setElement(term9062, 12, enum32);
        setElement(term9062, 13, enum33);
        setElement(term9062, 14, enum34);
        setElement(term9062, 15, enum35);
        setElement(term9062, 16, enum36);
        setElement(term9062, 17, enum37);
        setElement(term9062, 18, enum38);
        setElement(term9062, 19, enum39);
        setElement(term9062, 20, enum40);
        setElement(term9062, 21, enum41);
        setElement(term9062, 22, enum42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term9062));
    }

};


