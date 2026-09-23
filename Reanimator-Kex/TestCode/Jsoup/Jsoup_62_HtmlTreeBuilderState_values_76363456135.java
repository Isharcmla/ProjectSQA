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

public class HtmlTreeBuilderState_values_76363456135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24768;

    public HtmlTreeBuilderState_values_76363456135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25091 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25090 = ((Class) term25091).getDeclaredField((String) "Initial");
        ((Field) term25090).setAccessible(true);
        Object enum64 = ((Field) term25090).get((Object) null);
        Class<? extends Object> term25304 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25303 = ((Class) term25304).getDeclaredField((String) "BeforeHtml");
        ((Field) term25303).setAccessible(true);
        Object enum65 = ((Field) term25303).get((Object) null);
        Class<? extends Object> term25526 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25525 = ((Class) term25526).getDeclaredField((String) "BeforeHead");
        ((Field) term25525).setAccessible(true);
        Object enum66 = ((Field) term25525).get((Object) null);
        Class<? extends Object> term25748 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25747 = ((Class) term25748).getDeclaredField((String) "InHead");
        ((Field) term25747).setAccessible(true);
        Object enum67 = ((Field) term25747).get((Object) null);
        Class<? extends Object> term25958 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25957 = ((Class) term25958).getDeclaredField((String) "InHeadNoscript");
        ((Field) term25957).setAccessible(true);
        Object enum68 = ((Field) term25957).get((Object) null);
        Class<? extends Object> term26192 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26191 = ((Class) term26192).getDeclaredField((String) "AfterHead");
        ((Field) term26191).setAccessible(true);
        Object enum69 = ((Field) term26191).get((Object) null);
        Class<? extends Object> term26411 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26410 = ((Class) term26411).getDeclaredField((String) "InBody");
        ((Field) term26410).setAccessible(true);
        Object enum70 = ((Field) term26410).get((Object) null);
        Class<? extends Object> term26621 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26620 = ((Class) term26621).getDeclaredField((String) "Text");
        ((Field) term26620).setAccessible(true);
        Object enum71 = ((Field) term26620).get((Object) null);
        Class<? extends Object> term26825 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26824 = ((Class) term26825).getDeclaredField((String) "InTable");
        ((Field) term26824).setAccessible(true);
        Object enum72 = ((Field) term26824).get((Object) null);
        Class<? extends Object> term27040 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27039 = ((Class) term27040).getDeclaredField((String) "InTableText");
        ((Field) term27039).setAccessible(true);
        Object enum73 = ((Field) term27039).get((Object) null);
        Class<? extends Object> term27296 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27295 = ((Class) term27296).getDeclaredField((String) "InCaption");
        ((Field) term27295).setAccessible(true);
        Object enum74 = ((Field) term27295).get((Object) null);
        Class<? extends Object> term27528 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27527 = ((Class) term27528).getDeclaredField((String) "InColumnGroup");
        ((Field) term27527).setAccessible(true);
        Object enum75 = ((Field) term27527).get((Object) null);
        Class<? extends Object> term27759 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27758 = ((Class) term27759).getDeclaredField((String) "InTableBody");
        ((Field) term27758).setAccessible(true);
        Object enum76 = ((Field) term27758).get((Object) null);
        Class<? extends Object> term27984 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27983 = ((Class) term27984).getDeclaredField((String) "InRow");
        ((Field) term27983).setAccessible(true);
        Object enum77 = ((Field) term27983).get((Object) null);
        Class<? extends Object> term28191 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28190 = ((Class) term28191).getDeclaredField((String) "InCell");
        ((Field) term28190).setAccessible(true);
        Object enum78 = ((Field) term28190).get((Object) null);
        Class<? extends Object> term28401 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28400 = ((Class) term28401).getDeclaredField((String) "InSelect");
        ((Field) term28400).setAccessible(true);
        Object enum79 = ((Field) term28400).get((Object) null);
        Class<? extends Object> term28617 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28616 = ((Class) term28617).getDeclaredField((String) "InSelectInTable");
        ((Field) term28616).setAccessible(true);
        Object enum80 = ((Field) term28616).get((Object) null);
        Class<? extends Object> term28854 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28853 = ((Class) term28854).getDeclaredField((String) "AfterBody");
        ((Field) term28853).setAccessible(true);
        Object enum81 = ((Field) term28853).get((Object) null);
        Class<? extends Object> term29073 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29072 = ((Class) term29073).getDeclaredField((String) "InFrameset");
        ((Field) term29072).setAccessible(true);
        Object enum82 = ((Field) term29072).get((Object) null);
        Class<? extends Object> term29295 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29294 = ((Class) term29295).getDeclaredField((String) "AfterFrameset");
        ((Field) term29294).setAccessible(true);
        Object enum83 = ((Field) term29294).get((Object) null);
        Class<? extends Object> term29526 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29525 = ((Class) term29526).getDeclaredField((String) "AfterAfterBody");
        ((Field) term29525).setAccessible(true);
        Object enum84 = ((Field) term29525).get((Object) null);
        Class<? extends Object> term29760 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29759 = ((Class) term29760).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term29759).setAccessible(true);
        Object enum85 = ((Field) term29759).get((Object) null);
        Class<? extends Object> term30006 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30005 = ((Class) term30006).getDeclaredField((String) "ForeignContent");
        ((Field) term30005).setAccessible(true);
        Object enum86 = ((Field) term30005).get((Object) null);
        term24768 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term24768, 0, enum64);
        setElement(term24768, 1, enum65);
        setElement(term24768, 2, enum66);
        setElement(term24768, 3, enum67);
        setElement(term24768, 4, enum68);
        setElement(term24768, 5, enum69);
        setElement(term24768, 6, enum70);
        setElement(term24768, 7, enum71);
        setElement(term24768, 8, enum72);
        setElement(term24768, 9, enum73);
        setElement(term24768, 10, enum74);
        setElement(term24768, 11, enum75);
        setElement(term24768, 12, enum76);
        setElement(term24768, 13, enum77);
        setElement(term24768, 14, enum78);
        setElement(term24768, 15, enum79);
        setElement(term24768, 16, enum80);
        setElement(term24768, 17, enum81);
        setElement(term24768, 18, enum82);
        setElement(term24768, 19, enum83);
        setElement(term24768, 20, enum84);
        setElement(term24768, 21, enum85);
        setElement(term24768, 22, enum86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term24768));
    }

};


