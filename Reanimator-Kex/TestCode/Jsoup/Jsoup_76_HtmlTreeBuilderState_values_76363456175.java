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

public class HtmlTreeBuilderState_values_76363456175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61476;

    public HtmlTreeBuilderState_values_76363456175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61799 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term61798 = ((Class) term61799).getDeclaredField((String) "Initial");
        ((Field) term61798).setAccessible(true);
        Object enum146 = ((Field) term61798).get((Object) null);
        Class<? extends Object> term62012 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term62011 = ((Class) term62012).getDeclaredField((String) "BeforeHtml");
        ((Field) term62011).setAccessible(true);
        Object enum147 = ((Field) term62011).get((Object) null);
        Class<? extends Object> term62234 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term62233 = ((Class) term62234).getDeclaredField((String) "BeforeHead");
        ((Field) term62233).setAccessible(true);
        Object enum148 = ((Field) term62233).get((Object) null);
        Class<? extends Object> term62456 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term62455 = ((Class) term62456).getDeclaredField((String) "InHead");
        ((Field) term62455).setAccessible(true);
        Object enum149 = ((Field) term62455).get((Object) null);
        Class<? extends Object> term62666 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term62665 = ((Class) term62666).getDeclaredField((String) "InHeadNoscript");
        ((Field) term62665).setAccessible(true);
        Object enum150 = ((Field) term62665).get((Object) null);
        Class<? extends Object> term62900 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term62899 = ((Class) term62900).getDeclaredField((String) "AfterHead");
        ((Field) term62899).setAccessible(true);
        Object enum151 = ((Field) term62899).get((Object) null);
        Class<? extends Object> term63119 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term63118 = ((Class) term63119).getDeclaredField((String) "InBody");
        ((Field) term63118).setAccessible(true);
        Object enum152 = ((Field) term63118).get((Object) null);
        Class<? extends Object> term63329 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term63328 = ((Class) term63329).getDeclaredField((String) "Text");
        ((Field) term63328).setAccessible(true);
        Object enum153 = ((Field) term63328).get((Object) null);
        Class<? extends Object> term63533 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term63532 = ((Class) term63533).getDeclaredField((String) "InTable");
        ((Field) term63532).setAccessible(true);
        Object enum154 = ((Field) term63532).get((Object) null);
        Class<? extends Object> term63746 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term63745 = ((Class) term63746).getDeclaredField((String) "InTableText");
        ((Field) term63745).setAccessible(true);
        Object enum155 = ((Field) term63745).get((Object) null);
        Class<? extends Object> term63971 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term63970 = ((Class) term63971).getDeclaredField((String) "InCaption");
        ((Field) term63970).setAccessible(true);
        Object enum156 = ((Field) term63970).get((Object) null);
        Class<? extends Object> term64190 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term64189 = ((Class) term64190).getDeclaredField((String) "InColumnGroup");
        ((Field) term64189).setAccessible(true);
        Object enum157 = ((Field) term64189).get((Object) null);
        Class<? extends Object> term64421 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term64420 = ((Class) term64421).getDeclaredField((String) "InTableBody");
        ((Field) term64420).setAccessible(true);
        Object enum158 = ((Field) term64420).get((Object) null);
        Class<? extends Object> term64646 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term64645 = ((Class) term64646).getDeclaredField((String) "InRow");
        ((Field) term64645).setAccessible(true);
        Object enum159 = ((Field) term64645).get((Object) null);
        Class<? extends Object> term64853 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term64852 = ((Class) term64853).getDeclaredField((String) "InCell");
        ((Field) term64852).setAccessible(true);
        Object enum160 = ((Field) term64852).get((Object) null);
        Class<? extends Object> term65063 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term65062 = ((Class) term65063).getDeclaredField((String) "InSelect");
        ((Field) term65062).setAccessible(true);
        Object enum161 = ((Field) term65062).get((Object) null);
        Class<? extends Object> term65279 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term65278 = ((Class) term65279).getDeclaredField((String) "InSelectInTable");
        ((Field) term65278).setAccessible(true);
        Object enum162 = ((Field) term65278).get((Object) null);
        Class<? extends Object> term65516 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term65515 = ((Class) term65516).getDeclaredField((String) "AfterBody");
        ((Field) term65515).setAccessible(true);
        Object enum163 = ((Field) term65515).get((Object) null);
        Class<? extends Object> term65735 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term65734 = ((Class) term65735).getDeclaredField((String) "InFrameset");
        ((Field) term65734).setAccessible(true);
        Object enum164 = ((Field) term65734).get((Object) null);
        Class<? extends Object> term65957 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term65956 = ((Class) term65957).getDeclaredField((String) "AfterFrameset");
        ((Field) term65956).setAccessible(true);
        Object enum165 = ((Field) term65956).get((Object) null);
        Class<? extends Object> term66188 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term66187 = ((Class) term66188).getDeclaredField((String) "AfterAfterBody");
        ((Field) term66187).setAccessible(true);
        Object enum166 = ((Field) term66187).get((Object) null);
        Class<? extends Object> term66422 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term66421 = ((Class) term66422).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term66421).setAccessible(true);
        Object enum167 = ((Field) term66421).get((Object) null);
        Class<? extends Object> term66671 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term66670 = ((Class) term66671).getDeclaredField((String) "ForeignContent");
        ((Field) term66670).setAccessible(true);
        Object enum168 = ((Field) term66670).get((Object) null);
        term61476 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term61476, 0, enum146);
        setElement(term61476, 1, enum147);
        setElement(term61476, 2, enum148);
        setElement(term61476, 3, enum149);
        setElement(term61476, 4, enum150);
        setElement(term61476, 5, enum151);
        setElement(term61476, 6, enum152);
        setElement(term61476, 7, enum153);
        setElement(term61476, 8, enum154);
        setElement(term61476, 9, enum155);
        setElement(term61476, 10, enum156);
        setElement(term61476, 11, enum157);
        setElement(term61476, 12, enum158);
        setElement(term61476, 13, enum159);
        setElement(term61476, 14, enum160);
        setElement(term61476, 15, enum161);
        setElement(term61476, 16, enum162);
        setElement(term61476, 17, enum163);
        setElement(term61476, 18, enum164);
        setElement(term61476, 19, enum165);
        setElement(term61476, 20, enum166);
        setElement(term61476, 21, enum167);
        setElement(term61476, 22, enum168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term61476));
    }

};


