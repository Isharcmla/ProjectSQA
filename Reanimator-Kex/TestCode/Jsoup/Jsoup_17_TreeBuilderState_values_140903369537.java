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

public class TreeBuilderState_values_140903369537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64926;

    public TreeBuilderState_values_140903369537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65249 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term65248 = ((Class) term65249).getDeclaredField((String) "Initial");
        ((Field) term65248).setAccessible(true);
        Object enum118 = ((Field) term65248).get((Object) null);
        Class<? extends Object> term65442 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term65441 = ((Class) term65442).getDeclaredField((String) "BeforeHtml");
        ((Field) term65441).setAccessible(true);
        Object enum119 = ((Field) term65441).get((Object) null);
        Class<? extends Object> term65644 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term65643 = ((Class) term65644).getDeclaredField((String) "BeforeHead");
        ((Field) term65643).setAccessible(true);
        Object enum120 = ((Field) term65643).get((Object) null);
        Class<? extends Object> term65846 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term65845 = ((Class) term65846).getDeclaredField((String) "InHead");
        ((Field) term65845).setAccessible(true);
        Object enum121 = ((Field) term65845).get((Object) null);
        Class<? extends Object> term66036 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term66035 = ((Class) term66036).getDeclaredField((String) "InHeadNoscript");
        ((Field) term66035).setAccessible(true);
        Object enum122 = ((Field) term66035).get((Object) null);
        Class<? extends Object> term66250 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term66249 = ((Class) term66250).getDeclaredField((String) "AfterHead");
        ((Field) term66249).setAccessible(true);
        Object enum123 = ((Field) term66249).get((Object) null);
        Class<? extends Object> term66449 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term66448 = ((Class) term66449).getDeclaredField((String) "InBody");
        ((Field) term66448).setAccessible(true);
        Object enum124 = ((Field) term66448).get((Object) null);
        Class<? extends Object> term66639 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term66638 = ((Class) term66639).getDeclaredField((String) "Text");
        ((Field) term66638).setAccessible(true);
        Object enum125 = ((Field) term66638).get((Object) null);
        Class<? extends Object> term66823 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term66822 = ((Class) term66823).getDeclaredField((String) "InTable");
        ((Field) term66822).setAccessible(true);
        Object enum126 = ((Field) term66822).get((Object) null);
        Class<? extends Object> term67016 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term67015 = ((Class) term67016).getDeclaredField((String) "InTableText");
        ((Field) term67015).setAccessible(true);
        Object enum127 = ((Field) term67015).get((Object) null);
        Class<? extends Object> term67221 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term67220 = ((Class) term67221).getDeclaredField((String) "InCaption");
        ((Field) term67220).setAccessible(true);
        Object enum128 = ((Field) term67220).get((Object) null);
        Class<? extends Object> term67420 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term67419 = ((Class) term67420).getDeclaredField((String) "InColumnGroup");
        ((Field) term67419).setAccessible(true);
        Object enum129 = ((Field) term67419).get((Object) null);
        Class<? extends Object> term67631 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term67630 = ((Class) term67631).getDeclaredField((String) "InTableBody");
        ((Field) term67630).setAccessible(true);
        Object enum130 = ((Field) term67630).get((Object) null);
        Class<? extends Object> term67836 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term67835 = ((Class) term67836).getDeclaredField((String) "InRow");
        ((Field) term67835).setAccessible(true);
        Object enum131 = ((Field) term67835).get((Object) null);
        Class<? extends Object> term68023 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term68022 = ((Class) term68023).getDeclaredField((String) "InCell");
        ((Field) term68022).setAccessible(true);
        Object enum132 = ((Field) term68022).get((Object) null);
        Class<? extends Object> term68213 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term68212 = ((Class) term68213).getDeclaredField((String) "InSelect");
        ((Field) term68212).setAccessible(true);
        Object enum133 = ((Field) term68212).get((Object) null);
        Class<? extends Object> term68409 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term68408 = ((Class) term68409).getDeclaredField((String) "InSelectInTable");
        ((Field) term68408).setAccessible(true);
        Object enum134 = ((Field) term68408).get((Object) null);
        Class<? extends Object> term68626 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term68625 = ((Class) term68626).getDeclaredField((String) "AfterBody");
        ((Field) term68625).setAccessible(true);
        Object enum135 = ((Field) term68625).get((Object) null);
        Class<? extends Object> term68825 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term68824 = ((Class) term68825).getDeclaredField((String) "InFrameset");
        ((Field) term68824).setAccessible(true);
        Object enum136 = ((Field) term68824).get((Object) null);
        Class<? extends Object> term69027 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term69026 = ((Class) term69027).getDeclaredField((String) "AfterFrameset");
        ((Field) term69026).setAccessible(true);
        Object enum137 = ((Field) term69026).get((Object) null);
        Class<? extends Object> term69238 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term69237 = ((Class) term69238).getDeclaredField((String) "AfterAfterBody");
        ((Field) term69237).setAccessible(true);
        Object enum138 = ((Field) term69237).get((Object) null);
        Class<? extends Object> term69452 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term69451 = ((Class) term69452).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term69451).setAccessible(true);
        Object enum139 = ((Field) term69451).get((Object) null);
        Class<? extends Object> term69679 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term69678 = ((Class) term69679).getDeclaredField((String) "ForeignContent");
        ((Field) term69678).setAccessible(true);
        Object enum140 = ((Field) term69678).get((Object) null);
        term64926 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term64926, 0, enum118);
        setElement(term64926, 1, enum119);
        setElement(term64926, 2, enum120);
        setElement(term64926, 3, enum121);
        setElement(term64926, 4, enum122);
        setElement(term64926, 5, enum123);
        setElement(term64926, 6, enum124);
        setElement(term64926, 7, enum125);
        setElement(term64926, 8, enum126);
        setElement(term64926, 9, enum127);
        setElement(term64926, 10, enum128);
        setElement(term64926, 11, enum129);
        setElement(term64926, 12, enum130);
        setElement(term64926, 13, enum131);
        setElement(term64926, 14, enum132);
        setElement(term64926, 15, enum133);
        setElement(term64926, 16, enum134);
        setElement(term64926, 17, enum135);
        setElement(term64926, 18, enum136);
        setElement(term64926, 19, enum137);
        setElement(term64926, 20, enum138);
        setElement(term64926, 21, enum139);
        setElement(term64926, 22, enum140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term64926));
    }

};


