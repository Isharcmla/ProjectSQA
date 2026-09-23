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

public class TreeBuilderState_values_140903369514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30645;

    public TreeBuilderState_values_140903369514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30968 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term30967 = ((Class) term30968).getDeclaredField((String) "Initial");
        ((Field) term30967).setAccessible(true);
        Object enum72 = ((Field) term30967).get((Object) null);
        Class<? extends Object> term31161 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term31160 = ((Class) term31161).getDeclaredField((String) "BeforeHtml");
        ((Field) term31160).setAccessible(true);
        Object enum73 = ((Field) term31160).get((Object) null);
        Class<? extends Object> term31363 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term31362 = ((Class) term31363).getDeclaredField((String) "BeforeHead");
        ((Field) term31362).setAccessible(true);
        Object enum74 = ((Field) term31362).get((Object) null);
        Class<? extends Object> term31565 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term31564 = ((Class) term31565).getDeclaredField((String) "InHead");
        ((Field) term31564).setAccessible(true);
        Object enum75 = ((Field) term31564).get((Object) null);
        Class<? extends Object> term31755 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term31754 = ((Class) term31755).getDeclaredField((String) "InHeadNoscript");
        ((Field) term31754).setAccessible(true);
        Object enum76 = ((Field) term31754).get((Object) null);
        Class<? extends Object> term31969 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term31968 = ((Class) term31969).getDeclaredField((String) "AfterHead");
        ((Field) term31968).setAccessible(true);
        Object enum77 = ((Field) term31968).get((Object) null);
        Class<? extends Object> term32168 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term32167 = ((Class) term32168).getDeclaredField((String) "InBody");
        ((Field) term32167).setAccessible(true);
        Object enum78 = ((Field) term32167).get((Object) null);
        Class<? extends Object> term32358 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term32357 = ((Class) term32358).getDeclaredField((String) "Text");
        ((Field) term32357).setAccessible(true);
        Object enum79 = ((Field) term32357).get((Object) null);
        Class<? extends Object> term32542 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term32541 = ((Class) term32542).getDeclaredField((String) "InTable");
        ((Field) term32541).setAccessible(true);
        Object enum80 = ((Field) term32541).get((Object) null);
        Class<? extends Object> term32735 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term32734 = ((Class) term32735).getDeclaredField((String) "InTableText");
        ((Field) term32734).setAccessible(true);
        Object enum81 = ((Field) term32734).get((Object) null);
        Class<? extends Object> term32940 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term32939 = ((Class) term32940).getDeclaredField((String) "InCaption");
        ((Field) term32939).setAccessible(true);
        Object enum82 = ((Field) term32939).get((Object) null);
        Class<? extends Object> term33139 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term33138 = ((Class) term33139).getDeclaredField((String) "InColumnGroup");
        ((Field) term33138).setAccessible(true);
        Object enum83 = ((Field) term33138).get((Object) null);
        Class<? extends Object> term33480 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term33479 = ((Class) term33480).getDeclaredField((String) "InTableBody");
        ((Field) term33479).setAccessible(true);
        Object enum84 = ((Field) term33479).get((Object) null);
        Class<? extends Object> term33776 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term33775 = ((Class) term33776).getDeclaredField((String) "InRow");
        ((Field) term33775).setAccessible(true);
        Object enum85 = ((Field) term33775).get((Object) null);
        Class<? extends Object> term34050 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term34049 = ((Class) term34050).getDeclaredField((String) "InCell");
        ((Field) term34049).setAccessible(true);
        Object enum86 = ((Field) term34049).get((Object) null);
        Class<? extends Object> term34242 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term34241 = ((Class) term34242).getDeclaredField((String) "InSelect");
        ((Field) term34241).setAccessible(true);
        Object enum87 = ((Field) term34241).get((Object) null);
        Class<? extends Object> term34438 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term34437 = ((Class) term34438).getDeclaredField((String) "InSelectInTable");
        ((Field) term34437).setAccessible(true);
        Object enum88 = ((Field) term34437).get((Object) null);
        Class<? extends Object> term34655 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term34654 = ((Class) term34655).getDeclaredField((String) "AfterBody");
        ((Field) term34654).setAccessible(true);
        Object enum89 = ((Field) term34654).get((Object) null);
        Class<? extends Object> term34854 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term34853 = ((Class) term34854).getDeclaredField((String) "InFrameset");
        ((Field) term34853).setAccessible(true);
        Object enum90 = ((Field) term34853).get((Object) null);
        Class<? extends Object> term35056 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term35055 = ((Class) term35056).getDeclaredField((String) "AfterFrameset");
        ((Field) term35055).setAccessible(true);
        Object enum91 = ((Field) term35055).get((Object) null);
        Class<? extends Object> term35267 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term35266 = ((Class) term35267).getDeclaredField((String) "AfterAfterBody");
        ((Field) term35266).setAccessible(true);
        Object enum92 = ((Field) term35266).get((Object) null);
        Class<? extends Object> term35481 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term35480 = ((Class) term35481).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term35480).setAccessible(true);
        Object enum93 = ((Field) term35480).get((Object) null);
        Class<? extends Object> term35707 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term35706 = ((Class) term35707).getDeclaredField((String) "ForeignContent");
        ((Field) term35706).setAccessible(true);
        Object enum94 = ((Field) term35706).get((Object) null);
        term30645 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term30645, 0, enum72);
        setElement(term30645, 1, enum73);
        setElement(term30645, 2, enum74);
        setElement(term30645, 3, enum75);
        setElement(term30645, 4, enum76);
        setElement(term30645, 5, enum77);
        setElement(term30645, 6, enum78);
        setElement(term30645, 7, enum79);
        setElement(term30645, 8, enum80);
        setElement(term30645, 9, enum81);
        setElement(term30645, 10, enum82);
        setElement(term30645, 11, enum83);
        setElement(term30645, 12, enum84);
        setElement(term30645, 13, enum85);
        setElement(term30645, 14, enum86);
        setElement(term30645, 15, enum87);
        setElement(term30645, 16, enum88);
        setElement(term30645, 17, enum89);
        setElement(term30645, 18, enum90);
        setElement(term30645, 19, enum91);
        setElement(term30645, 20, enum92);
        setElement(term30645, 21, enum93);
        setElement(term30645, 22, enum94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term30645));
    }

};


