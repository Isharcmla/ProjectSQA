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

public class TreeBuilderState_values_140903369515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33387;

    public TreeBuilderState_values_140903369515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35893 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term35892 = ((Class) term35893).getDeclaredField((String) "Initial");
        ((Field) term35892).setAccessible(true);
        Object enum95 = ((Field) term35892).get((Object) null);
        Class<? extends Object> term36086 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36085 = ((Class) term36086).getDeclaredField((String) "BeforeHtml");
        ((Field) term36085).setAccessible(true);
        Object enum96 = ((Field) term36085).get((Object) null);
        Class<? extends Object> term36288 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36287 = ((Class) term36288).getDeclaredField((String) "BeforeHead");
        ((Field) term36287).setAccessible(true);
        Object enum97 = ((Field) term36287).get((Object) null);
        Class<? extends Object> term36490 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36489 = ((Class) term36490).getDeclaredField((String) "InHead");
        ((Field) term36489).setAccessible(true);
        Object enum98 = ((Field) term36489).get((Object) null);
        Class<? extends Object> term36680 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36679 = ((Class) term36680).getDeclaredField((String) "InHeadNoscript");
        ((Field) term36679).setAccessible(true);
        Object enum99 = ((Field) term36679).get((Object) null);
        Class<? extends Object> term36894 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36893 = ((Class) term36894).getDeclaredField((String) "AfterHead");
        ((Field) term36893).setAccessible(true);
        Object enum100 = ((Field) term36893).get((Object) null);
        Class<? extends Object> term37093 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37092 = ((Class) term37093).getDeclaredField((String) "InBody");
        ((Field) term37092).setAccessible(true);
        Object enum101 = ((Field) term37092).get((Object) null);
        Class<? extends Object> term37283 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37282 = ((Class) term37283).getDeclaredField((String) "Text");
        ((Field) term37282).setAccessible(true);
        Object enum102 = ((Field) term37282).get((Object) null);
        Class<? extends Object> term37467 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37466 = ((Class) term37467).getDeclaredField((String) "InTable");
        ((Field) term37466).setAccessible(true);
        Object enum103 = ((Field) term37466).get((Object) null);
        Class<? extends Object> term37660 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37659 = ((Class) term37660).getDeclaredField((String) "InTableText");
        ((Field) term37659).setAccessible(true);
        Object enum104 = ((Field) term37659).get((Object) null);
        Class<? extends Object> term37865 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37864 = ((Class) term37865).getDeclaredField((String) "InCaption");
        ((Field) term37864).setAccessible(true);
        Object enum105 = ((Field) term37864).get((Object) null);
        Class<? extends Object> term38064 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38063 = ((Class) term38064).getDeclaredField((String) "InColumnGroup");
        ((Field) term38063).setAccessible(true);
        Object enum106 = ((Field) term38063).get((Object) null);
        Class<? extends Object> term38275 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38274 = ((Class) term38275).getDeclaredField((String) "InTableBody");
        ((Field) term38274).setAccessible(true);
        Object enum107 = ((Field) term38274).get((Object) null);
        Class<? extends Object> term38480 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38479 = ((Class) term38480).getDeclaredField((String) "InRow");
        ((Field) term38479).setAccessible(true);
        Object enum108 = ((Field) term38479).get((Object) null);
        Class<? extends Object> term38667 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38666 = ((Class) term38667).getDeclaredField((String) "InCell");
        ((Field) term38666).setAccessible(true);
        Object enum109 = ((Field) term38666).get((Object) null);
        Class<? extends Object> term38857 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38856 = ((Class) term38857).getDeclaredField((String) "InSelect");
        ((Field) term38856).setAccessible(true);
        Object enum110 = ((Field) term38856).get((Object) null);
        Class<? extends Object> term39053 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39052 = ((Class) term39053).getDeclaredField((String) "InSelectInTable");
        ((Field) term39052).setAccessible(true);
        Object enum111 = ((Field) term39052).get((Object) null);
        Class<? extends Object> term39270 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39269 = ((Class) term39270).getDeclaredField((String) "AfterBody");
        ((Field) term39269).setAccessible(true);
        Object enum112 = ((Field) term39269).get((Object) null);
        Class<? extends Object> term39469 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39468 = ((Class) term39469).getDeclaredField((String) "InFrameset");
        ((Field) term39468).setAccessible(true);
        Object enum113 = ((Field) term39468).get((Object) null);
        Class<? extends Object> term39671 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39670 = ((Class) term39671).getDeclaredField((String) "AfterFrameset");
        ((Field) term39670).setAccessible(true);
        Object enum114 = ((Field) term39670).get((Object) null);
        Class<? extends Object> term39882 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39881 = ((Class) term39882).getDeclaredField((String) "AfterAfterBody");
        ((Field) term39881).setAccessible(true);
        Object enum115 = ((Field) term39881).get((Object) null);
        Class<? extends Object> term40096 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term40095 = ((Class) term40096).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term40095).setAccessible(true);
        Object enum116 = ((Field) term40095).get((Object) null);
        Class<? extends Object> term40322 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term40321 = ((Class) term40322).getDeclaredField((String) "ForeignContent");
        ((Field) term40321).setAccessible(true);
        Object enum117 = ((Field) term40321).get((Object) null);
        term33387 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term33387, 0, enum95);
        setElement(term33387, 1, enum96);
        setElement(term33387, 2, enum97);
        setElement(term33387, 3, enum98);
        setElement(term33387, 4, enum99);
        setElement(term33387, 5, enum100);
        setElement(term33387, 6, enum101);
        setElement(term33387, 7, enum102);
        setElement(term33387, 8, enum103);
        setElement(term33387, 9, enum104);
        setElement(term33387, 10, enum105);
        setElement(term33387, 11, enum106);
        setElement(term33387, 12, enum107);
        setElement(term33387, 13, enum108);
        setElement(term33387, 14, enum109);
        setElement(term33387, 15, enum110);
        setElement(term33387, 16, enum111);
        setElement(term33387, 17, enum112);
        setElement(term33387, 18, enum113);
        setElement(term33387, 19, enum114);
        setElement(term33387, 20, enum115);
        setElement(term33387, 21, enum116);
        setElement(term33387, 22, enum117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term33387));
    }

};


