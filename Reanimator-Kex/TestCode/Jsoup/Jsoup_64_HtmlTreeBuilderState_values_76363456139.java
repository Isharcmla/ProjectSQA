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

public class HtmlTreeBuilderState_values_76363456139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30525;

    public HtmlTreeBuilderState_values_76363456139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30848 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30847 = ((Class) term30848).getDeclaredField((String) "Initial");
        ((Field) term30847).setAccessible(true);
        Object enum69 = ((Field) term30847).get((Object) null);
        Class<? extends Object> term31061 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31060 = ((Class) term31061).getDeclaredField((String) "BeforeHtml");
        ((Field) term31060).setAccessible(true);
        Object enum70 = ((Field) term31060).get((Object) null);
        Class<? extends Object> term31283 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31282 = ((Class) term31283).getDeclaredField((String) "BeforeHead");
        ((Field) term31282).setAccessible(true);
        Object enum71 = ((Field) term31282).get((Object) null);
        Class<? extends Object> term31505 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31504 = ((Class) term31505).getDeclaredField((String) "InHead");
        ((Field) term31504).setAccessible(true);
        Object enum72 = ((Field) term31504).get((Object) null);
        Class<? extends Object> term31715 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31714 = ((Class) term31715).getDeclaredField((String) "InHeadNoscript");
        ((Field) term31714).setAccessible(true);
        Object enum73 = ((Field) term31714).get((Object) null);
        Class<? extends Object> term31949 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31948 = ((Class) term31949).getDeclaredField((String) "AfterHead");
        ((Field) term31948).setAccessible(true);
        Object enum74 = ((Field) term31948).get((Object) null);
        Class<? extends Object> term32168 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32167 = ((Class) term32168).getDeclaredField((String) "InBody");
        ((Field) term32167).setAccessible(true);
        Object enum75 = ((Field) term32167).get((Object) null);
        Class<? extends Object> term32378 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32377 = ((Class) term32378).getDeclaredField((String) "Text");
        ((Field) term32377).setAccessible(true);
        Object enum76 = ((Field) term32377).get((Object) null);
        Class<? extends Object> term32582 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32581 = ((Class) term32582).getDeclaredField((String) "InTable");
        ((Field) term32581).setAccessible(true);
        Object enum77 = ((Field) term32581).get((Object) null);
        Class<? extends Object> term32795 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32794 = ((Class) term32795).getDeclaredField((String) "InTableText");
        ((Field) term32794).setAccessible(true);
        Object enum78 = ((Field) term32794).get((Object) null);
        Class<? extends Object> term33020 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33019 = ((Class) term33020).getDeclaredField((String) "InCaption");
        ((Field) term33019).setAccessible(true);
        Object enum79 = ((Field) term33019).get((Object) null);
        Class<? extends Object> term33239 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33238 = ((Class) term33239).getDeclaredField((String) "InColumnGroup");
        ((Field) term33238).setAccessible(true);
        Object enum80 = ((Field) term33238).get((Object) null);
        Class<? extends Object> term33470 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33469 = ((Class) term33470).getDeclaredField((String) "InTableBody");
        ((Field) term33469).setAccessible(true);
        Object enum81 = ((Field) term33469).get((Object) null);
        Class<? extends Object> term33695 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33694 = ((Class) term33695).getDeclaredField((String) "InRow");
        ((Field) term33694).setAccessible(true);
        Object enum82 = ((Field) term33694).get((Object) null);
        Class<? extends Object> term33902 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33901 = ((Class) term33902).getDeclaredField((String) "InCell");
        ((Field) term33901).setAccessible(true);
        Object enum83 = ((Field) term33901).get((Object) null);
        Class<? extends Object> term34112 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34111 = ((Class) term34112).getDeclaredField((String) "InSelect");
        ((Field) term34111).setAccessible(true);
        Object enum84 = ((Field) term34111).get((Object) null);
        Class<? extends Object> term34328 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34327 = ((Class) term34328).getDeclaredField((String) "InSelectInTable");
        ((Field) term34327).setAccessible(true);
        Object enum85 = ((Field) term34327).get((Object) null);
        Class<? extends Object> term34565 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34564 = ((Class) term34565).getDeclaredField((String) "AfterBody");
        ((Field) term34564).setAccessible(true);
        Object enum86 = ((Field) term34564).get((Object) null);
        Class<? extends Object> term34784 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34783 = ((Class) term34784).getDeclaredField((String) "InFrameset");
        ((Field) term34783).setAccessible(true);
        Object enum87 = ((Field) term34783).get((Object) null);
        Class<? extends Object> term35006 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35005 = ((Class) term35006).getDeclaredField((String) "AfterFrameset");
        ((Field) term35005).setAccessible(true);
        Object enum88 = ((Field) term35005).get((Object) null);
        Class<? extends Object> term35237 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35236 = ((Class) term35237).getDeclaredField((String) "AfterAfterBody");
        ((Field) term35236).setAccessible(true);
        Object enum89 = ((Field) term35236).get((Object) null);
        Class<? extends Object> term35471 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35470 = ((Class) term35471).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term35470).setAccessible(true);
        Object enum90 = ((Field) term35470).get((Object) null);
        Class<? extends Object> term35717 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35716 = ((Class) term35717).getDeclaredField((String) "ForeignContent");
        ((Field) term35716).setAccessible(true);
        Object enum91 = ((Field) term35716).get((Object) null);
        term30525 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term30525, 0, enum69);
        setElement(term30525, 1, enum70);
        setElement(term30525, 2, enum71);
        setElement(term30525, 3, enum72);
        setElement(term30525, 4, enum73);
        setElement(term30525, 5, enum74);
        setElement(term30525, 6, enum75);
        setElement(term30525, 7, enum76);
        setElement(term30525, 8, enum77);
        setElement(term30525, 9, enum78);
        setElement(term30525, 10, enum79);
        setElement(term30525, 11, enum80);
        setElement(term30525, 12, enum81);
        setElement(term30525, 13, enum82);
        setElement(term30525, 14, enum83);
        setElement(term30525, 15, enum84);
        setElement(term30525, 16, enum85);
        setElement(term30525, 17, enum86);
        setElement(term30525, 18, enum87);
        setElement(term30525, 19, enum88);
        setElement(term30525, 20, enum89);
        setElement(term30525, 21, enum90);
        setElement(term30525, 22, enum91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term30525));
    }

};


