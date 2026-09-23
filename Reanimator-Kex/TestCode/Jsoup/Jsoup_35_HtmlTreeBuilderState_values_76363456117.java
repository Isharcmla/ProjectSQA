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

public class HtmlTreeBuilderState_values_76363456117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29424;

    public HtmlTreeBuilderState_values_76363456117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29747 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29746 = ((Class) term29747).getDeclaredField((String) "Initial");
        ((Field) term29746).setAccessible(true);
        Object enum89 = ((Field) term29746).get((Object) null);
        Class<? extends Object> term29960 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29959 = ((Class) term29960).getDeclaredField((String) "BeforeHtml");
        ((Field) term29959).setAccessible(true);
        Object enum90 = ((Field) term29959).get((Object) null);
        Class<? extends Object> term30182 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30181 = ((Class) term30182).getDeclaredField((String) "BeforeHead");
        ((Field) term30181).setAccessible(true);
        Object enum91 = ((Field) term30181).get((Object) null);
        Class<? extends Object> term30404 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30403 = ((Class) term30404).getDeclaredField((String) "InHead");
        ((Field) term30403).setAccessible(true);
        Object enum92 = ((Field) term30403).get((Object) null);
        Class<? extends Object> term30614 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30613 = ((Class) term30614).getDeclaredField((String) "InHeadNoscript");
        ((Field) term30613).setAccessible(true);
        Object enum93 = ((Field) term30613).get((Object) null);
        Class<? extends Object> term30848 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30847 = ((Class) term30848).getDeclaredField((String) "AfterHead");
        ((Field) term30847).setAccessible(true);
        Object enum94 = ((Field) term30847).get((Object) null);
        Class<? extends Object> term31067 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31066 = ((Class) term31067).getDeclaredField((String) "InBody");
        ((Field) term31066).setAccessible(true);
        Object enum95 = ((Field) term31066).get((Object) null);
        Class<? extends Object> term31277 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31276 = ((Class) term31277).getDeclaredField((String) "Text");
        ((Field) term31276).setAccessible(true);
        Object enum96 = ((Field) term31276).get((Object) null);
        Class<? extends Object> term31481 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31480 = ((Class) term31481).getDeclaredField((String) "InTable");
        ((Field) term31480).setAccessible(true);
        Object enum97 = ((Field) term31480).get((Object) null);
        Class<? extends Object> term31694 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31693 = ((Class) term31694).getDeclaredField((String) "InTableText");
        ((Field) term31693).setAccessible(true);
        Object enum98 = ((Field) term31693).get((Object) null);
        Class<? extends Object> term31919 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31918 = ((Class) term31919).getDeclaredField((String) "InCaption");
        ((Field) term31918).setAccessible(true);
        Object enum99 = ((Field) term31918).get((Object) null);
        Class<? extends Object> term32138 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32137 = ((Class) term32138).getDeclaredField((String) "InColumnGroup");
        ((Field) term32137).setAccessible(true);
        Object enum100 = ((Field) term32137).get((Object) null);
        Class<? extends Object> term32369 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32368 = ((Class) term32369).getDeclaredField((String) "InTableBody");
        ((Field) term32368).setAccessible(true);
        Object enum101 = ((Field) term32368).get((Object) null);
        Class<? extends Object> term32594 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32593 = ((Class) term32594).getDeclaredField((String) "InRow");
        ((Field) term32593).setAccessible(true);
        Object enum102 = ((Field) term32593).get((Object) null);
        Class<? extends Object> term32801 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32800 = ((Class) term32801).getDeclaredField((String) "InCell");
        ((Field) term32800).setAccessible(true);
        Object enum103 = ((Field) term32800).get((Object) null);
        Class<? extends Object> term33011 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33010 = ((Class) term33011).getDeclaredField((String) "InSelect");
        ((Field) term33010).setAccessible(true);
        Object enum104 = ((Field) term33010).get((Object) null);
        Class<? extends Object> term33227 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33226 = ((Class) term33227).getDeclaredField((String) "InSelectInTable");
        ((Field) term33226).setAccessible(true);
        Object enum105 = ((Field) term33226).get((Object) null);
        Class<? extends Object> term33464 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33463 = ((Class) term33464).getDeclaredField((String) "AfterBody");
        ((Field) term33463).setAccessible(true);
        Object enum106 = ((Field) term33463).get((Object) null);
        Class<? extends Object> term33683 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33682 = ((Class) term33683).getDeclaredField((String) "InFrameset");
        ((Field) term33682).setAccessible(true);
        Object enum107 = ((Field) term33682).get((Object) null);
        Class<? extends Object> term33905 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33904 = ((Class) term33905).getDeclaredField((String) "AfterFrameset");
        ((Field) term33904).setAccessible(true);
        Object enum108 = ((Field) term33904).get((Object) null);
        Class<? extends Object> term34136 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34135 = ((Class) term34136).getDeclaredField((String) "AfterAfterBody");
        ((Field) term34135).setAccessible(true);
        Object enum109 = ((Field) term34135).get((Object) null);
        Class<? extends Object> term34370 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34369 = ((Class) term34370).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term34369).setAccessible(true);
        Object enum110 = ((Field) term34369).get((Object) null);
        Class<? extends Object> term34616 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34615 = ((Class) term34616).getDeclaredField((String) "ForeignContent");
        ((Field) term34615).setAccessible(true);
        Object enum111 = ((Field) term34615).get((Object) null);
        term29424 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term29424, 0, enum89);
        setElement(term29424, 1, enum90);
        setElement(term29424, 2, enum91);
        setElement(term29424, 3, enum92);
        setElement(term29424, 4, enum93);
        setElement(term29424, 5, enum94);
        setElement(term29424, 6, enum95);
        setElement(term29424, 7, enum96);
        setElement(term29424, 8, enum97);
        setElement(term29424, 9, enum98);
        setElement(term29424, 10, enum99);
        setElement(term29424, 11, enum100);
        setElement(term29424, 12, enum101);
        setElement(term29424, 13, enum102);
        setElement(term29424, 14, enum103);
        setElement(term29424, 15, enum104);
        setElement(term29424, 16, enum105);
        setElement(term29424, 17, enum106);
        setElement(term29424, 18, enum107);
        setElement(term29424, 19, enum108);
        setElement(term29424, 20, enum109);
        setElement(term29424, 21, enum110);
        setElement(term29424, 22, enum111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term29424));
    }

};


