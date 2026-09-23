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

public class HtmlTreeBuilderState_values_76363456125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17991;

    public HtmlTreeBuilderState_values_76363456125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18314 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term18313 = ((Class) term18314).getDeclaredField((String) "Initial");
        ((Field) term18313).setAccessible(true);
        Object enum41 = ((Field) term18313).get((Object) null);
        Class<? extends Object> term18527 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term18526 = ((Class) term18527).getDeclaredField((String) "BeforeHtml");
        ((Field) term18526).setAccessible(true);
        Object enum42 = ((Field) term18526).get((Object) null);
        Class<? extends Object> term18749 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term18748 = ((Class) term18749).getDeclaredField((String) "BeforeHead");
        ((Field) term18748).setAccessible(true);
        Object enum43 = ((Field) term18748).get((Object) null);
        Class<? extends Object> term18971 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term18970 = ((Class) term18971).getDeclaredField((String) "InHead");
        ((Field) term18970).setAccessible(true);
        Object enum44 = ((Field) term18970).get((Object) null);
        Class<? extends Object> term19181 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19180 = ((Class) term19181).getDeclaredField((String) "InHeadNoscript");
        ((Field) term19180).setAccessible(true);
        Object enum45 = ((Field) term19180).get((Object) null);
        Class<? extends Object> term19415 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19414 = ((Class) term19415).getDeclaredField((String) "AfterHead");
        ((Field) term19414).setAccessible(true);
        Object enum46 = ((Field) term19414).get((Object) null);
        Class<? extends Object> term19634 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19633 = ((Class) term19634).getDeclaredField((String) "InBody");
        ((Field) term19633).setAccessible(true);
        Object enum47 = ((Field) term19633).get((Object) null);
        Class<? extends Object> term19844 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19843 = ((Class) term19844).getDeclaredField((String) "Text");
        ((Field) term19843).setAccessible(true);
        Object enum48 = ((Field) term19843).get((Object) null);
        Class<? extends Object> term20048 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20047 = ((Class) term20048).getDeclaredField((String) "InTable");
        ((Field) term20047).setAccessible(true);
        Object enum49 = ((Field) term20047).get((Object) null);
        Class<? extends Object> term20261 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20260 = ((Class) term20261).getDeclaredField((String) "InTableText");
        ((Field) term20260).setAccessible(true);
        Object enum50 = ((Field) term20260).get((Object) null);
        Class<? extends Object> term20486 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20485 = ((Class) term20486).getDeclaredField((String) "InCaption");
        ((Field) term20485).setAccessible(true);
        Object enum51 = ((Field) term20485).get((Object) null);
        Class<? extends Object> term20706 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20705 = ((Class) term20706).getDeclaredField((String) "InColumnGroup");
        ((Field) term20705).setAccessible(true);
        Object enum52 = ((Field) term20705).get((Object) null);
        Class<? extends Object> term20937 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20936 = ((Class) term20937).getDeclaredField((String) "InTableBody");
        ((Field) term20936).setAccessible(true);
        Object enum53 = ((Field) term20936).get((Object) null);
        Class<? extends Object> term21162 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21161 = ((Class) term21162).getDeclaredField((String) "InRow");
        ((Field) term21161).setAccessible(true);
        Object enum54 = ((Field) term21161).get((Object) null);
        Class<? extends Object> term21369 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21368 = ((Class) term21369).getDeclaredField((String) "InCell");
        ((Field) term21368).setAccessible(true);
        Object enum55 = ((Field) term21368).get((Object) null);
        Class<? extends Object> term21579 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21578 = ((Class) term21579).getDeclaredField((String) "InSelect");
        ((Field) term21578).setAccessible(true);
        Object enum56 = ((Field) term21578).get((Object) null);
        Class<? extends Object> term21795 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21794 = ((Class) term21795).getDeclaredField((String) "InSelectInTable");
        ((Field) term21794).setAccessible(true);
        Object enum57 = ((Field) term21794).get((Object) null);
        Class<? extends Object> term22032 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22031 = ((Class) term22032).getDeclaredField((String) "AfterBody");
        ((Field) term22031).setAccessible(true);
        Object enum58 = ((Field) term22031).get((Object) null);
        Class<? extends Object> term22251 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22250 = ((Class) term22251).getDeclaredField((String) "InFrameset");
        ((Field) term22250).setAccessible(true);
        Object enum59 = ((Field) term22250).get((Object) null);
        Class<? extends Object> term22473 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22472 = ((Class) term22473).getDeclaredField((String) "AfterFrameset");
        ((Field) term22472).setAccessible(true);
        Object enum60 = ((Field) term22472).get((Object) null);
        Class<? extends Object> term22704 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22703 = ((Class) term22704).getDeclaredField((String) "AfterAfterBody");
        ((Field) term22703).setAccessible(true);
        Object enum61 = ((Field) term22703).get((Object) null);
        Class<? extends Object> term22938 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22937 = ((Class) term22938).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term22937).setAccessible(true);
        Object enum62 = ((Field) term22937).get((Object) null);
        Class<? extends Object> term23184 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23183 = ((Class) term23184).getDeclaredField((String) "ForeignContent");
        ((Field) term23183).setAccessible(true);
        Object enum63 = ((Field) term23183).get((Object) null);
        term17991 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term17991, 0, enum41);
        setElement(term17991, 1, enum42);
        setElement(term17991, 2, enum43);
        setElement(term17991, 3, enum44);
        setElement(term17991, 4, enum45);
        setElement(term17991, 5, enum46);
        setElement(term17991, 6, enum47);
        setElement(term17991, 7, enum48);
        setElement(term17991, 8, enum49);
        setElement(term17991, 9, enum50);
        setElement(term17991, 10, enum51);
        setElement(term17991, 11, enum52);
        setElement(term17991, 12, enum53);
        setElement(term17991, 13, enum54);
        setElement(term17991, 14, enum55);
        setElement(term17991, 15, enum56);
        setElement(term17991, 16, enum57);
        setElement(term17991, 17, enum58);
        setElement(term17991, 18, enum59);
        setElement(term17991, 19, enum60);
        setElement(term17991, 20, enum61);
        setElement(term17991, 21, enum62);
        setElement(term17991, 22, enum63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term17991));
    }

};


