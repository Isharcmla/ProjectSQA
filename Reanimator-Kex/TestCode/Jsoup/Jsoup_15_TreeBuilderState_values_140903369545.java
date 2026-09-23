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

public class TreeBuilderState_values_140903369545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74040;

    public TreeBuilderState_values_140903369545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74363 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term74362 = ((Class) term74363).getDeclaredField((String) "Initial");
        ((Field) term74362).setAccessible(true);
        Object enum179 = ((Field) term74362).get((Object) null);
        Class<? extends Object> term74556 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term74555 = ((Class) term74556).getDeclaredField((String) "BeforeHtml");
        ((Field) term74555).setAccessible(true);
        Object enum180 = ((Field) term74555).get((Object) null);
        Class<? extends Object> term74758 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term74757 = ((Class) term74758).getDeclaredField((String) "BeforeHead");
        ((Field) term74757).setAccessible(true);
        Object enum181 = ((Field) term74757).get((Object) null);
        Class<? extends Object> term74960 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term74959 = ((Class) term74960).getDeclaredField((String) "InHead");
        ((Field) term74959).setAccessible(true);
        Object enum182 = ((Field) term74959).get((Object) null);
        Class<? extends Object> term75150 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term75149 = ((Class) term75150).getDeclaredField((String) "InHeadNoscript");
        ((Field) term75149).setAccessible(true);
        Object enum183 = ((Field) term75149).get((Object) null);
        Class<? extends Object> term75364 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term75363 = ((Class) term75364).getDeclaredField((String) "AfterHead");
        ((Field) term75363).setAccessible(true);
        Object enum184 = ((Field) term75363).get((Object) null);
        Class<? extends Object> term75563 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term75562 = ((Class) term75563).getDeclaredField((String) "InBody");
        ((Field) term75562).setAccessible(true);
        Object enum185 = ((Field) term75562).get((Object) null);
        Class<? extends Object> term75753 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term75752 = ((Class) term75753).getDeclaredField((String) "Text");
        ((Field) term75752).setAccessible(true);
        Object enum186 = ((Field) term75752).get((Object) null);
        Class<? extends Object> term75937 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term75936 = ((Class) term75937).getDeclaredField((String) "InTable");
        ((Field) term75936).setAccessible(true);
        Object enum187 = ((Field) term75936).get((Object) null);
        Class<? extends Object> term76130 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term76129 = ((Class) term76130).getDeclaredField((String) "InTableText");
        ((Field) term76129).setAccessible(true);
        Object enum188 = ((Field) term76129).get((Object) null);
        Class<? extends Object> term76335 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term76334 = ((Class) term76335).getDeclaredField((String) "InCaption");
        ((Field) term76334).setAccessible(true);
        Object enum189 = ((Field) term76334).get((Object) null);
        Class<? extends Object> term76534 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term76533 = ((Class) term76534).getDeclaredField((String) "InColumnGroup");
        ((Field) term76533).setAccessible(true);
        Object enum190 = ((Field) term76533).get((Object) null);
        Class<? extends Object> term76745 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term76744 = ((Class) term76745).getDeclaredField((String) "InTableBody");
        ((Field) term76744).setAccessible(true);
        Object enum191 = ((Field) term76744).get((Object) null);
        Class<? extends Object> term76950 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term76949 = ((Class) term76950).getDeclaredField((String) "InRow");
        ((Field) term76949).setAccessible(true);
        Object enum192 = ((Field) term76949).get((Object) null);
        Class<? extends Object> term77137 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term77136 = ((Class) term77137).getDeclaredField((String) "InCell");
        ((Field) term77136).setAccessible(true);
        Object enum193 = ((Field) term77136).get((Object) null);
        Class<? extends Object> term77327 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term77326 = ((Class) term77327).getDeclaredField((String) "InSelect");
        ((Field) term77326).setAccessible(true);
        Object enum194 = ((Field) term77326).get((Object) null);
        Class<? extends Object> term77523 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term77522 = ((Class) term77523).getDeclaredField((String) "InSelectInTable");
        ((Field) term77522).setAccessible(true);
        Object enum195 = ((Field) term77522).get((Object) null);
        Class<? extends Object> term77740 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term77739 = ((Class) term77740).getDeclaredField((String) "AfterBody");
        ((Field) term77739).setAccessible(true);
        Object enum196 = ((Field) term77739).get((Object) null);
        Class<? extends Object> term77939 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term77938 = ((Class) term77939).getDeclaredField((String) "InFrameset");
        ((Field) term77938).setAccessible(true);
        Object enum197 = ((Field) term77938).get((Object) null);
        Class<? extends Object> term78141 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term78140 = ((Class) term78141).getDeclaredField((String) "AfterFrameset");
        ((Field) term78140).setAccessible(true);
        Object enum198 = ((Field) term78140).get((Object) null);
        Class<? extends Object> term78352 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term78351 = ((Class) term78352).getDeclaredField((String) "AfterAfterBody");
        ((Field) term78351).setAccessible(true);
        Object enum199 = ((Field) term78351).get((Object) null);
        Class<? extends Object> term78566 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term78565 = ((Class) term78566).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term78565).setAccessible(true);
        Object enum200 = ((Field) term78565).get((Object) null);
        Class<? extends Object> term78792 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term78791 = ((Class) term78792).getDeclaredField((String) "ForeignContent");
        ((Field) term78791).setAccessible(true);
        Object enum201 = ((Field) term78791).get((Object) null);
        term74040 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term74040, 0, enum179);
        setElement(term74040, 1, enum180);
        setElement(term74040, 2, enum181);
        setElement(term74040, 3, enum182);
        setElement(term74040, 4, enum183);
        setElement(term74040, 5, enum184);
        setElement(term74040, 6, enum185);
        setElement(term74040, 7, enum186);
        setElement(term74040, 8, enum187);
        setElement(term74040, 9, enum188);
        setElement(term74040, 10, enum189);
        setElement(term74040, 11, enum190);
        setElement(term74040, 12, enum191);
        setElement(term74040, 13, enum192);
        setElement(term74040, 14, enum193);
        setElement(term74040, 15, enum194);
        setElement(term74040, 16, enum195);
        setElement(term74040, 17, enum196);
        setElement(term74040, 18, enum197);
        setElement(term74040, 19, enum198);
        setElement(term74040, 20, enum199);
        setElement(term74040, 21, enum200);
        setElement(term74040, 22, enum201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term74040));
    }

};


