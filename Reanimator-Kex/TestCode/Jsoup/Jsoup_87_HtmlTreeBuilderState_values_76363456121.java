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

public class HtmlTreeBuilderState_values_76363456121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30326;

    public HtmlTreeBuilderState_values_76363456121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30649 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30648 = ((Class) term30649).getDeclaredField((String) "Initial");
        ((Field) term30648).setAccessible(true);
        Object enum74 = ((Field) term30648).get((Object) null);
        Class<? extends Object> term30862 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30861 = ((Class) term30862).getDeclaredField((String) "BeforeHtml");
        ((Field) term30861).setAccessible(true);
        Object enum75 = ((Field) term30861).get((Object) null);
        Class<? extends Object> term31084 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31083 = ((Class) term31084).getDeclaredField((String) "BeforeHead");
        ((Field) term31083).setAccessible(true);
        Object enum76 = ((Field) term31083).get((Object) null);
        Class<? extends Object> term31306 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31305 = ((Class) term31306).getDeclaredField((String) "InHead");
        ((Field) term31305).setAccessible(true);
        Object enum77 = ((Field) term31305).get((Object) null);
        Class<? extends Object> term31516 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31515 = ((Class) term31516).getDeclaredField((String) "InHeadNoscript");
        ((Field) term31515).setAccessible(true);
        Object enum78 = ((Field) term31515).get((Object) null);
        Class<? extends Object> term31750 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31749 = ((Class) term31750).getDeclaredField((String) "AfterHead");
        ((Field) term31749).setAccessible(true);
        Object enum79 = ((Field) term31749).get((Object) null);
        Class<? extends Object> term31969 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31968 = ((Class) term31969).getDeclaredField((String) "InBody");
        ((Field) term31968).setAccessible(true);
        Object enum80 = ((Field) term31968).get((Object) null);
        Class<? extends Object> term32179 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32178 = ((Class) term32179).getDeclaredField((String) "Text");
        ((Field) term32178).setAccessible(true);
        Object enum81 = ((Field) term32178).get((Object) null);
        Class<? extends Object> term32383 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32382 = ((Class) term32383).getDeclaredField((String) "InTable");
        ((Field) term32382).setAccessible(true);
        Object enum82 = ((Field) term32382).get((Object) null);
        Class<? extends Object> term32596 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32595 = ((Class) term32596).getDeclaredField((String) "InTableText");
        ((Field) term32595).setAccessible(true);
        Object enum83 = ((Field) term32595).get((Object) null);
        Class<? extends Object> term32821 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32820 = ((Class) term32821).getDeclaredField((String) "InCaption");
        ((Field) term32820).setAccessible(true);
        Object enum84 = ((Field) term32820).get((Object) null);
        Class<? extends Object> term33040 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33039 = ((Class) term33040).getDeclaredField((String) "InColumnGroup");
        ((Field) term33039).setAccessible(true);
        Object enum85 = ((Field) term33039).get((Object) null);
        Class<? extends Object> term33271 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33270 = ((Class) term33271).getDeclaredField((String) "InTableBody");
        ((Field) term33270).setAccessible(true);
        Object enum86 = ((Field) term33270).get((Object) null);
        Class<? extends Object> term33496 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33495 = ((Class) term33496).getDeclaredField((String) "InRow");
        ((Field) term33495).setAccessible(true);
        Object enum87 = ((Field) term33495).get((Object) null);
        Class<? extends Object> term33703 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33702 = ((Class) term33703).getDeclaredField((String) "InCell");
        ((Field) term33702).setAccessible(true);
        Object enum88 = ((Field) term33702).get((Object) null);
        Class<? extends Object> term33913 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33912 = ((Class) term33913).getDeclaredField((String) "InSelect");
        ((Field) term33912).setAccessible(true);
        Object enum89 = ((Field) term33912).get((Object) null);
        Class<? extends Object> term34129 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34128 = ((Class) term34129).getDeclaredField((String) "InSelectInTable");
        ((Field) term34128).setAccessible(true);
        Object enum90 = ((Field) term34128).get((Object) null);
        Class<? extends Object> term34366 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34365 = ((Class) term34366).getDeclaredField((String) "AfterBody");
        ((Field) term34365).setAccessible(true);
        Object enum91 = ((Field) term34365).get((Object) null);
        Class<? extends Object> term34585 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34584 = ((Class) term34585).getDeclaredField((String) "InFrameset");
        ((Field) term34584).setAccessible(true);
        Object enum92 = ((Field) term34584).get((Object) null);
        Class<? extends Object> term34807 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34806 = ((Class) term34807).getDeclaredField((String) "AfterFrameset");
        ((Field) term34806).setAccessible(true);
        Object enum93 = ((Field) term34806).get((Object) null);
        Class<? extends Object> term35038 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35037 = ((Class) term35038).getDeclaredField((String) "AfterAfterBody");
        ((Field) term35037).setAccessible(true);
        Object enum94 = ((Field) term35037).get((Object) null);
        Class<? extends Object> term35272 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35271 = ((Class) term35272).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term35271).setAccessible(true);
        Object enum95 = ((Field) term35271).get((Object) null);
        Class<? extends Object> term35518 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35517 = ((Class) term35518).getDeclaredField((String) "ForeignContent");
        ((Field) term35517).setAccessible(true);
        Object enum96 = ((Field) term35517).get((Object) null);
        term30326 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term30326, 0, enum74);
        setElement(term30326, 1, enum75);
        setElement(term30326, 2, enum76);
        setElement(term30326, 3, enum77);
        setElement(term30326, 4, enum78);
        setElement(term30326, 5, enum79);
        setElement(term30326, 6, enum80);
        setElement(term30326, 7, enum81);
        setElement(term30326, 8, enum82);
        setElement(term30326, 9, enum83);
        setElement(term30326, 10, enum84);
        setElement(term30326, 11, enum85);
        setElement(term30326, 12, enum86);
        setElement(term30326, 13, enum87);
        setElement(term30326, 14, enum88);
        setElement(term30326, 15, enum89);
        setElement(term30326, 16, enum90);
        setElement(term30326, 17, enum91);
        setElement(term30326, 18, enum92);
        setElement(term30326, 19, enum93);
        setElement(term30326, 20, enum94);
        setElement(term30326, 21, enum95);
        setElement(term30326, 22, enum96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term30326));
    }

};


