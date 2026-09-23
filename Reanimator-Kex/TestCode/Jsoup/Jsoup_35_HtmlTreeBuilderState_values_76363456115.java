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

public class HtmlTreeBuilderState_values_76363456115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23507;

    public HtmlTreeBuilderState_values_76363456115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23830 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23829 = ((Class) term23830).getDeclaredField((String) "Initial");
        ((Field) term23829).setAccessible(true);
        Object enum66 = ((Field) term23829).get((Object) null);
        Class<? extends Object> term24043 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24042 = ((Class) term24043).getDeclaredField((String) "BeforeHtml");
        ((Field) term24042).setAccessible(true);
        Object enum67 = ((Field) term24042).get((Object) null);
        Class<? extends Object> term24265 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24264 = ((Class) term24265).getDeclaredField((String) "BeforeHead");
        ((Field) term24264).setAccessible(true);
        Object enum68 = ((Field) term24264).get((Object) null);
        Class<? extends Object> term24487 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24486 = ((Class) term24487).getDeclaredField((String) "InHead");
        ((Field) term24486).setAccessible(true);
        Object enum69 = ((Field) term24486).get((Object) null);
        Class<? extends Object> term24697 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24696 = ((Class) term24697).getDeclaredField((String) "InHeadNoscript");
        ((Field) term24696).setAccessible(true);
        Object enum70 = ((Field) term24696).get((Object) null);
        Class<? extends Object> term24931 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24930 = ((Class) term24931).getDeclaredField((String) "AfterHead");
        ((Field) term24930).setAccessible(true);
        Object enum71 = ((Field) term24930).get((Object) null);
        Class<? extends Object> term25150 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25149 = ((Class) term25150).getDeclaredField((String) "InBody");
        ((Field) term25149).setAccessible(true);
        Object enum72 = ((Field) term25149).get((Object) null);
        Class<? extends Object> term25360 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25359 = ((Class) term25360).getDeclaredField((String) "Text");
        ((Field) term25359).setAccessible(true);
        Object enum73 = ((Field) term25359).get((Object) null);
        Class<? extends Object> term25564 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25563 = ((Class) term25564).getDeclaredField((String) "InTable");
        ((Field) term25563).setAccessible(true);
        Object enum74 = ((Field) term25563).get((Object) null);
        Class<? extends Object> term25777 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25776 = ((Class) term25777).getDeclaredField((String) "InTableText");
        ((Field) term25776).setAccessible(true);
        Object enum75 = ((Field) term25776).get((Object) null);
        Class<? extends Object> term26002 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26001 = ((Class) term26002).getDeclaredField((String) "InCaption");
        ((Field) term26001).setAccessible(true);
        Object enum76 = ((Field) term26001).get((Object) null);
        Class<? extends Object> term26221 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26220 = ((Class) term26221).getDeclaredField((String) "InColumnGroup");
        ((Field) term26220).setAccessible(true);
        Object enum77 = ((Field) term26220).get((Object) null);
        Class<? extends Object> term26452 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26451 = ((Class) term26452).getDeclaredField((String) "InTableBody");
        ((Field) term26451).setAccessible(true);
        Object enum78 = ((Field) term26451).get((Object) null);
        Class<? extends Object> term26677 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26676 = ((Class) term26677).getDeclaredField((String) "InRow");
        ((Field) term26676).setAccessible(true);
        Object enum79 = ((Field) term26676).get((Object) null);
        Class<? extends Object> term26884 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26883 = ((Class) term26884).getDeclaredField((String) "InCell");
        ((Field) term26883).setAccessible(true);
        Object enum80 = ((Field) term26883).get((Object) null);
        Class<? extends Object> term27094 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27093 = ((Class) term27094).getDeclaredField((String) "InSelect");
        ((Field) term27093).setAccessible(true);
        Object enum81 = ((Field) term27093).get((Object) null);
        Class<? extends Object> term27310 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27309 = ((Class) term27310).getDeclaredField((String) "InSelectInTable");
        ((Field) term27309).setAccessible(true);
        Object enum82 = ((Field) term27309).get((Object) null);
        Class<? extends Object> term27547 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27546 = ((Class) term27547).getDeclaredField((String) "AfterBody");
        ((Field) term27546).setAccessible(true);
        Object enum83 = ((Field) term27546).get((Object) null);
        Class<? extends Object> term27766 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27765 = ((Class) term27766).getDeclaredField((String) "InFrameset");
        ((Field) term27765).setAccessible(true);
        Object enum84 = ((Field) term27765).get((Object) null);
        Class<? extends Object> term27988 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27987 = ((Class) term27988).getDeclaredField((String) "AfterFrameset");
        ((Field) term27987).setAccessible(true);
        Object enum85 = ((Field) term27987).get((Object) null);
        Class<? extends Object> term28219 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28218 = ((Class) term28219).getDeclaredField((String) "AfterAfterBody");
        ((Field) term28218).setAccessible(true);
        Object enum86 = ((Field) term28218).get((Object) null);
        Class<? extends Object> term28453 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28452 = ((Class) term28453).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term28452).setAccessible(true);
        Object enum87 = ((Field) term28452).get((Object) null);
        Class<? extends Object> term28699 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28698 = ((Class) term28699).getDeclaredField((String) "ForeignContent");
        ((Field) term28698).setAccessible(true);
        Object enum88 = ((Field) term28698).get((Object) null);
        term23507 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term23507, 0, enum66);
        setElement(term23507, 1, enum67);
        setElement(term23507, 2, enum68);
        setElement(term23507, 3, enum69);
        setElement(term23507, 4, enum70);
        setElement(term23507, 5, enum71);
        setElement(term23507, 6, enum72);
        setElement(term23507, 7, enum73);
        setElement(term23507, 8, enum74);
        setElement(term23507, 9, enum75);
        setElement(term23507, 10, enum76);
        setElement(term23507, 11, enum77);
        setElement(term23507, 12, enum78);
        setElement(term23507, 13, enum79);
        setElement(term23507, 14, enum80);
        setElement(term23507, 15, enum81);
        setElement(term23507, 16, enum82);
        setElement(term23507, 17, enum83);
        setElement(term23507, 18, enum84);
        setElement(term23507, 19, enum85);
        setElement(term23507, 20, enum86);
        setElement(term23507, 21, enum87);
        setElement(term23507, 22, enum88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term23507));
    }

};


