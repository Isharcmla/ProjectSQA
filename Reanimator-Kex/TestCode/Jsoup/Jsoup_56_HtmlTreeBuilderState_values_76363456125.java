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
     Object term26688;

    public HtmlTreeBuilderState_values_76363456125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27011 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27010 = ((Class) term27011).getDeclaredField((String) "Initial");
        ((Field) term27010).setAccessible(true);
        Object enum65 = ((Field) term27010).get((Object) null);
        Class<? extends Object> term27224 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27223 = ((Class) term27224).getDeclaredField((String) "BeforeHtml");
        ((Field) term27223).setAccessible(true);
        Object enum66 = ((Field) term27223).get((Object) null);
        Class<? extends Object> term27446 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27445 = ((Class) term27446).getDeclaredField((String) "BeforeHead");
        ((Field) term27445).setAccessible(true);
        Object enum67 = ((Field) term27445).get((Object) null);
        Class<? extends Object> term27668 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27667 = ((Class) term27668).getDeclaredField((String) "InHead");
        ((Field) term27667).setAccessible(true);
        Object enum68 = ((Field) term27667).get((Object) null);
        Class<? extends Object> term27878 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27877 = ((Class) term27878).getDeclaredField((String) "InHeadNoscript");
        ((Field) term27877).setAccessible(true);
        Object enum69 = ((Field) term27877).get((Object) null);
        Class<? extends Object> term28112 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28111 = ((Class) term28112).getDeclaredField((String) "AfterHead");
        ((Field) term28111).setAccessible(true);
        Object enum70 = ((Field) term28111).get((Object) null);
        Class<? extends Object> term28331 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28330 = ((Class) term28331).getDeclaredField((String) "InBody");
        ((Field) term28330).setAccessible(true);
        Object enum71 = ((Field) term28330).get((Object) null);
        Class<? extends Object> term28541 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28540 = ((Class) term28541).getDeclaredField((String) "Text");
        ((Field) term28540).setAccessible(true);
        Object enum72 = ((Field) term28540).get((Object) null);
        Class<? extends Object> term28745 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28744 = ((Class) term28745).getDeclaredField((String) "InTable");
        ((Field) term28744).setAccessible(true);
        Object enum73 = ((Field) term28744).get((Object) null);
        Class<? extends Object> term28958 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28957 = ((Class) term28958).getDeclaredField((String) "InTableText");
        ((Field) term28957).setAccessible(true);
        Object enum74 = ((Field) term28957).get((Object) null);
        Class<? extends Object> term29183 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29182 = ((Class) term29183).getDeclaredField((String) "InCaption");
        ((Field) term29182).setAccessible(true);
        Object enum75 = ((Field) term29182).get((Object) null);
        Class<? extends Object> term29402 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29401 = ((Class) term29402).getDeclaredField((String) "InColumnGroup");
        ((Field) term29401).setAccessible(true);
        Object enum76 = ((Field) term29401).get((Object) null);
        Class<? extends Object> term29633 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29632 = ((Class) term29633).getDeclaredField((String) "InTableBody");
        ((Field) term29632).setAccessible(true);
        Object enum77 = ((Field) term29632).get((Object) null);
        Class<? extends Object> term29858 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29857 = ((Class) term29858).getDeclaredField((String) "InRow");
        ((Field) term29857).setAccessible(true);
        Object enum78 = ((Field) term29857).get((Object) null);
        Class<? extends Object> term30065 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30064 = ((Class) term30065).getDeclaredField((String) "InCell");
        ((Field) term30064).setAccessible(true);
        Object enum79 = ((Field) term30064).get((Object) null);
        Class<? extends Object> term30275 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30274 = ((Class) term30275).getDeclaredField((String) "InSelect");
        ((Field) term30274).setAccessible(true);
        Object enum80 = ((Field) term30274).get((Object) null);
        Class<? extends Object> term30491 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30490 = ((Class) term30491).getDeclaredField((String) "InSelectInTable");
        ((Field) term30490).setAccessible(true);
        Object enum81 = ((Field) term30490).get((Object) null);
        Class<? extends Object> term30728 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30727 = ((Class) term30728).getDeclaredField((String) "AfterBody");
        ((Field) term30727).setAccessible(true);
        Object enum82 = ((Field) term30727).get((Object) null);
        Class<? extends Object> term30947 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30946 = ((Class) term30947).getDeclaredField((String) "InFrameset");
        ((Field) term30946).setAccessible(true);
        Object enum83 = ((Field) term30946).get((Object) null);
        Class<? extends Object> term31169 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31168 = ((Class) term31169).getDeclaredField((String) "AfterFrameset");
        ((Field) term31168).setAccessible(true);
        Object enum84 = ((Field) term31168).get((Object) null);
        Class<? extends Object> term31400 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31399 = ((Class) term31400).getDeclaredField((String) "AfterAfterBody");
        ((Field) term31399).setAccessible(true);
        Object enum85 = ((Field) term31399).get((Object) null);
        Class<? extends Object> term31634 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31633 = ((Class) term31634).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term31633).setAccessible(true);
        Object enum86 = ((Field) term31633).get((Object) null);
        Class<? extends Object> term31880 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31879 = ((Class) term31880).getDeclaredField((String) "ForeignContent");
        ((Field) term31879).setAccessible(true);
        Object enum87 = ((Field) term31879).get((Object) null);
        term26688 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term26688, 0, enum65);
        setElement(term26688, 1, enum66);
        setElement(term26688, 2, enum67);
        setElement(term26688, 3, enum68);
        setElement(term26688, 4, enum69);
        setElement(term26688, 5, enum70);
        setElement(term26688, 6, enum71);
        setElement(term26688, 7, enum72);
        setElement(term26688, 8, enum73);
        setElement(term26688, 9, enum74);
        setElement(term26688, 10, enum75);
        setElement(term26688, 11, enum76);
        setElement(term26688, 12, enum77);
        setElement(term26688, 13, enum78);
        setElement(term26688, 14, enum79);
        setElement(term26688, 15, enum80);
        setElement(term26688, 16, enum81);
        setElement(term26688, 17, enum82);
        setElement(term26688, 18, enum83);
        setElement(term26688, 19, enum84);
        setElement(term26688, 20, enum85);
        setElement(term26688, 21, enum86);
        setElement(term26688, 22, enum87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term26688));
    }

};


