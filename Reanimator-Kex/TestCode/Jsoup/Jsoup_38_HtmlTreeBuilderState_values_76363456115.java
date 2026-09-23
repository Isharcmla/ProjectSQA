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
     Object term27229;

    public HtmlTreeBuilderState_values_76363456115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27552 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27551 = ((Class) term27552).getDeclaredField((String) "Initial");
        ((Field) term27551).setAccessible(true);
        Object enum66 = ((Field) term27551).get((Object) null);
        Class<? extends Object> term27765 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27764 = ((Class) term27765).getDeclaredField((String) "BeforeHtml");
        ((Field) term27764).setAccessible(true);
        Object enum67 = ((Field) term27764).get((Object) null);
        Class<? extends Object> term27987 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27986 = ((Class) term27987).getDeclaredField((String) "BeforeHead");
        ((Field) term27986).setAccessible(true);
        Object enum68 = ((Field) term27986).get((Object) null);
        Class<? extends Object> term28209 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28208 = ((Class) term28209).getDeclaredField((String) "InHead");
        ((Field) term28208).setAccessible(true);
        Object enum69 = ((Field) term28208).get((Object) null);
        Class<? extends Object> term28419 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28418 = ((Class) term28419).getDeclaredField((String) "InHeadNoscript");
        ((Field) term28418).setAccessible(true);
        Object enum70 = ((Field) term28418).get((Object) null);
        Class<? extends Object> term28653 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28652 = ((Class) term28653).getDeclaredField((String) "AfterHead");
        ((Field) term28652).setAccessible(true);
        Object enum71 = ((Field) term28652).get((Object) null);
        Class<? extends Object> term28872 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28871 = ((Class) term28872).getDeclaredField((String) "InBody");
        ((Field) term28871).setAccessible(true);
        Object enum72 = ((Field) term28871).get((Object) null);
        Class<? extends Object> term29082 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29081 = ((Class) term29082).getDeclaredField((String) "Text");
        ((Field) term29081).setAccessible(true);
        Object enum73 = ((Field) term29081).get((Object) null);
        Class<? extends Object> term29286 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29285 = ((Class) term29286).getDeclaredField((String) "InTable");
        ((Field) term29285).setAccessible(true);
        Object enum74 = ((Field) term29285).get((Object) null);
        Class<? extends Object> term29499 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29498 = ((Class) term29499).getDeclaredField((String) "InTableText");
        ((Field) term29498).setAccessible(true);
        Object enum75 = ((Field) term29498).get((Object) null);
        Class<? extends Object> term29724 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29723 = ((Class) term29724).getDeclaredField((String) "InCaption");
        ((Field) term29723).setAccessible(true);
        Object enum76 = ((Field) term29723).get((Object) null);
        Class<? extends Object> term29943 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29942 = ((Class) term29943).getDeclaredField((String) "InColumnGroup");
        ((Field) term29942).setAccessible(true);
        Object enum77 = ((Field) term29942).get((Object) null);
        Class<? extends Object> term30174 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30173 = ((Class) term30174).getDeclaredField((String) "InTableBody");
        ((Field) term30173).setAccessible(true);
        Object enum78 = ((Field) term30173).get((Object) null);
        Class<? extends Object> term30399 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30398 = ((Class) term30399).getDeclaredField((String) "InRow");
        ((Field) term30398).setAccessible(true);
        Object enum79 = ((Field) term30398).get((Object) null);
        Class<? extends Object> term30606 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30605 = ((Class) term30606).getDeclaredField((String) "InCell");
        ((Field) term30605).setAccessible(true);
        Object enum80 = ((Field) term30605).get((Object) null);
        Class<? extends Object> term30816 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30815 = ((Class) term30816).getDeclaredField((String) "InSelect");
        ((Field) term30815).setAccessible(true);
        Object enum81 = ((Field) term30815).get((Object) null);
        Class<? extends Object> term31032 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31031 = ((Class) term31032).getDeclaredField((String) "InSelectInTable");
        ((Field) term31031).setAccessible(true);
        Object enum82 = ((Field) term31031).get((Object) null);
        Class<? extends Object> term31269 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31268 = ((Class) term31269).getDeclaredField((String) "AfterBody");
        ((Field) term31268).setAccessible(true);
        Object enum83 = ((Field) term31268).get((Object) null);
        Class<? extends Object> term31488 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31487 = ((Class) term31488).getDeclaredField((String) "InFrameset");
        ((Field) term31487).setAccessible(true);
        Object enum84 = ((Field) term31487).get((Object) null);
        Class<? extends Object> term31710 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31709 = ((Class) term31710).getDeclaredField((String) "AfterFrameset");
        ((Field) term31709).setAccessible(true);
        Object enum85 = ((Field) term31709).get((Object) null);
        Class<? extends Object> term31941 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31940 = ((Class) term31941).getDeclaredField((String) "AfterAfterBody");
        ((Field) term31940).setAccessible(true);
        Object enum86 = ((Field) term31940).get((Object) null);
        Class<? extends Object> term32175 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32174 = ((Class) term32175).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term32174).setAccessible(true);
        Object enum87 = ((Field) term32174).get((Object) null);
        Class<? extends Object> term32421 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32420 = ((Class) term32421).getDeclaredField((String) "ForeignContent");
        ((Field) term32420).setAccessible(true);
        Object enum88 = ((Field) term32420).get((Object) null);
        term27229 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term27229, 0, enum66);
        setElement(term27229, 1, enum67);
        setElement(term27229, 2, enum68);
        setElement(term27229, 3, enum69);
        setElement(term27229, 4, enum70);
        setElement(term27229, 5, enum71);
        setElement(term27229, 6, enum72);
        setElement(term27229, 7, enum73);
        setElement(term27229, 8, enum74);
        setElement(term27229, 9, enum75);
        setElement(term27229, 10, enum76);
        setElement(term27229, 11, enum77);
        setElement(term27229, 12, enum78);
        setElement(term27229, 13, enum79);
        setElement(term27229, 14, enum80);
        setElement(term27229, 15, enum81);
        setElement(term27229, 16, enum82);
        setElement(term27229, 17, enum83);
        setElement(term27229, 18, enum84);
        setElement(term27229, 19, enum85);
        setElement(term27229, 20, enum86);
        setElement(term27229, 21, enum87);
        setElement(term27229, 22, enum88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term27229));
    }

};


