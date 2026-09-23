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
     Object term33176;

    public TreeBuilderState_values_140903369515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35745 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term35744 = ((Class) term35745).getDeclaredField((String) "Initial");
        ((Field) term35744).setAccessible(true);
        Object enum95 = ((Field) term35744).get((Object) null);
        Class<? extends Object> term36112 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36111 = ((Class) term36112).getDeclaredField((String) "BeforeHtml");
        ((Field) term36111).setAccessible(true);
        Object enum96 = ((Field) term36111).get((Object) null);
        Class<? extends Object> term36314 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36313 = ((Class) term36314).getDeclaredField((String) "BeforeHead");
        ((Field) term36313).setAccessible(true);
        Object enum97 = ((Field) term36313).get((Object) null);
        Class<? extends Object> term36516 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36515 = ((Class) term36516).getDeclaredField((String) "InHead");
        ((Field) term36515).setAccessible(true);
        Object enum98 = ((Field) term36515).get((Object) null);
        Class<? extends Object> term36706 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36705 = ((Class) term36706).getDeclaredField((String) "InHeadNoscript");
        ((Field) term36705).setAccessible(true);
        Object enum99 = ((Field) term36705).get((Object) null);
        Class<? extends Object> term36920 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term36919 = ((Class) term36920).getDeclaredField((String) "AfterHead");
        ((Field) term36919).setAccessible(true);
        Object enum100 = ((Field) term36919).get((Object) null);
        Class<? extends Object> term37119 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37118 = ((Class) term37119).getDeclaredField((String) "InBody");
        ((Field) term37118).setAccessible(true);
        Object enum101 = ((Field) term37118).get((Object) null);
        Class<? extends Object> term37309 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37308 = ((Class) term37309).getDeclaredField((String) "Text");
        ((Field) term37308).setAccessible(true);
        Object enum102 = ((Field) term37308).get((Object) null);
        Class<? extends Object> term37493 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37492 = ((Class) term37493).getDeclaredField((String) "InTable");
        ((Field) term37492).setAccessible(true);
        Object enum103 = ((Field) term37492).get((Object) null);
        Class<? extends Object> term37686 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37685 = ((Class) term37686).getDeclaredField((String) "InTableText");
        ((Field) term37685).setAccessible(true);
        Object enum104 = ((Field) term37685).get((Object) null);
        Class<? extends Object> term37891 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term37890 = ((Class) term37891).getDeclaredField((String) "InCaption");
        ((Field) term37890).setAccessible(true);
        Object enum105 = ((Field) term37890).get((Object) null);
        Class<? extends Object> term38090 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38089 = ((Class) term38090).getDeclaredField((String) "InColumnGroup");
        ((Field) term38089).setAccessible(true);
        Object enum106 = ((Field) term38089).get((Object) null);
        Class<? extends Object> term38301 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38300 = ((Class) term38301).getDeclaredField((String) "InTableBody");
        ((Field) term38300).setAccessible(true);
        Object enum107 = ((Field) term38300).get((Object) null);
        Class<? extends Object> term38506 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38505 = ((Class) term38506).getDeclaredField((String) "InRow");
        ((Field) term38505).setAccessible(true);
        Object enum108 = ((Field) term38505).get((Object) null);
        Class<? extends Object> term38693 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38692 = ((Class) term38693).getDeclaredField((String) "InCell");
        ((Field) term38692).setAccessible(true);
        Object enum109 = ((Field) term38692).get((Object) null);
        Class<? extends Object> term38883 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term38882 = ((Class) term38883).getDeclaredField((String) "InSelect");
        ((Field) term38882).setAccessible(true);
        Object enum110 = ((Field) term38882).get((Object) null);
        Class<? extends Object> term39079 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39078 = ((Class) term39079).getDeclaredField((String) "InSelectInTable");
        ((Field) term39078).setAccessible(true);
        Object enum111 = ((Field) term39078).get((Object) null);
        Class<? extends Object> term39296 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39295 = ((Class) term39296).getDeclaredField((String) "AfterBody");
        ((Field) term39295).setAccessible(true);
        Object enum112 = ((Field) term39295).get((Object) null);
        Class<? extends Object> term39495 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39494 = ((Class) term39495).getDeclaredField((String) "InFrameset");
        ((Field) term39494).setAccessible(true);
        Object enum113 = ((Field) term39494).get((Object) null);
        Class<? extends Object> term39697 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39696 = ((Class) term39697).getDeclaredField((String) "AfterFrameset");
        ((Field) term39696).setAccessible(true);
        Object enum114 = ((Field) term39696).get((Object) null);
        Class<? extends Object> term39908 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term39907 = ((Class) term39908).getDeclaredField((String) "AfterAfterBody");
        ((Field) term39907).setAccessible(true);
        Object enum115 = ((Field) term39907).get((Object) null);
        Class<? extends Object> term40122 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term40121 = ((Class) term40122).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term40121).setAccessible(true);
        Object enum116 = ((Field) term40121).get((Object) null);
        Class<? extends Object> term40348 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term40347 = ((Class) term40348).getDeclaredField((String) "ForeignContent");
        ((Field) term40347).setAccessible(true);
        Object enum117 = ((Field) term40347).get((Object) null);
        term33176 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term33176, 0, enum95);
        setElement(term33176, 1, enum96);
        setElement(term33176, 2, enum97);
        setElement(term33176, 3, enum98);
        setElement(term33176, 4, enum99);
        setElement(term33176, 5, enum100);
        setElement(term33176, 6, enum101);
        setElement(term33176, 7, enum102);
        setElement(term33176, 8, enum103);
        setElement(term33176, 9, enum104);
        setElement(term33176, 10, enum105);
        setElement(term33176, 11, enum106);
        setElement(term33176, 12, enum107);
        setElement(term33176, 13, enum108);
        setElement(term33176, 14, enum109);
        setElement(term33176, 15, enum110);
        setElement(term33176, 16, enum111);
        setElement(term33176, 17, enum112);
        setElement(term33176, 18, enum113);
        setElement(term33176, 19, enum114);
        setElement(term33176, 20, enum115);
        setElement(term33176, 21, enum116);
        setElement(term33176, 22, enum117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term33176));
    }

};


