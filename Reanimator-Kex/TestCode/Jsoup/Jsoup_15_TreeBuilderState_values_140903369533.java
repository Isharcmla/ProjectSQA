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

public class TreeBuilderState_values_140903369533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61043;

    public TreeBuilderState_values_140903369533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61366 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term61365 = ((Class) term61366).getDeclaredField((String) "Initial");
        ((Field) term61365).setAccessible(true);
        Object enum144 = ((Field) term61365).get((Object) null);
        Class<? extends Object> term61559 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term61558 = ((Class) term61559).getDeclaredField((String) "BeforeHtml");
        ((Field) term61558).setAccessible(true);
        Object enum145 = ((Field) term61558).get((Object) null);
        Class<? extends Object> term61761 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term61760 = ((Class) term61761).getDeclaredField((String) "BeforeHead");
        ((Field) term61760).setAccessible(true);
        Object enum146 = ((Field) term61760).get((Object) null);
        Class<? extends Object> term61963 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term61962 = ((Class) term61963).getDeclaredField((String) "InHead");
        ((Field) term61962).setAccessible(true);
        Object enum147 = ((Field) term61962).get((Object) null);
        Class<? extends Object> term62165 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term62164 = ((Class) term62165).getDeclaredField((String) "InHeadNoscript");
        ((Field) term62164).setAccessible(true);
        Object enum148 = ((Field) term62164).get((Object) null);
        Class<? extends Object> term62379 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term62378 = ((Class) term62379).getDeclaredField((String) "AfterHead");
        ((Field) term62378).setAccessible(true);
        Object enum149 = ((Field) term62378).get((Object) null);
        Class<? extends Object> term62578 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term62577 = ((Class) term62578).getDeclaredField((String) "InBody");
        ((Field) term62577).setAccessible(true);
        Object enum150 = ((Field) term62577).get((Object) null);
        Class<? extends Object> term62768 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term62767 = ((Class) term62768).getDeclaredField((String) "Text");
        ((Field) term62767).setAccessible(true);
        Object enum151 = ((Field) term62767).get((Object) null);
        Class<? extends Object> term62952 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term62951 = ((Class) term62952).getDeclaredField((String) "InTable");
        ((Field) term62951).setAccessible(true);
        Object enum152 = ((Field) term62951).get((Object) null);
        Class<? extends Object> term63145 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term63144 = ((Class) term63145).getDeclaredField((String) "InTableText");
        ((Field) term63144).setAccessible(true);
        Object enum153 = ((Field) term63144).get((Object) null);
        Class<? extends Object> term63350 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term63349 = ((Class) term63350).getDeclaredField((String) "InCaption");
        ((Field) term63349).setAccessible(true);
        Object enum154 = ((Field) term63349).get((Object) null);
        Class<? extends Object> term63549 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term63548 = ((Class) term63549).getDeclaredField((String) "InColumnGroup");
        ((Field) term63548).setAccessible(true);
        Object enum155 = ((Field) term63548).get((Object) null);
        Class<? extends Object> term63760 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term63759 = ((Class) term63760).getDeclaredField((String) "InTableBody");
        ((Field) term63759).setAccessible(true);
        Object enum156 = ((Field) term63759).get((Object) null);
        Class<? extends Object> term63965 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term63964 = ((Class) term63965).getDeclaredField((String) "InRow");
        ((Field) term63964).setAccessible(true);
        Object enum157 = ((Field) term63964).get((Object) null);
        Class<? extends Object> term64152 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term64151 = ((Class) term64152).getDeclaredField((String) "InCell");
        ((Field) term64151).setAccessible(true);
        Object enum158 = ((Field) term64151).get((Object) null);
        Class<? extends Object> term64342 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term64341 = ((Class) term64342).getDeclaredField((String) "InSelect");
        ((Field) term64341).setAccessible(true);
        Object enum159 = ((Field) term64341).get((Object) null);
        Class<? extends Object> term64538 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term64537 = ((Class) term64538).getDeclaredField((String) "InSelectInTable");
        ((Field) term64537).setAccessible(true);
        Object enum160 = ((Field) term64537).get((Object) null);
        Class<? extends Object> term64755 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term64754 = ((Class) term64755).getDeclaredField((String) "AfterBody");
        ((Field) term64754).setAccessible(true);
        Object enum161 = ((Field) term64754).get((Object) null);
        Class<? extends Object> term64954 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term64953 = ((Class) term64954).getDeclaredField((String) "InFrameset");
        ((Field) term64953).setAccessible(true);
        Object enum162 = ((Field) term64953).get((Object) null);
        Class<? extends Object> term65156 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term65155 = ((Class) term65156).getDeclaredField((String) "AfterFrameset");
        ((Field) term65155).setAccessible(true);
        Object enum163 = ((Field) term65155).get((Object) null);
        Class<? extends Object> term65367 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term65366 = ((Class) term65367).getDeclaredField((String) "AfterAfterBody");
        ((Field) term65366).setAccessible(true);
        Object enum164 = ((Field) term65366).get((Object) null);
        Class<? extends Object> term65581 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term65580 = ((Class) term65581).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term65580).setAccessible(true);
        Object enum165 = ((Field) term65580).get((Object) null);
        Class<? extends Object> term65807 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term65806 = ((Class) term65807).getDeclaredField((String) "ForeignContent");
        ((Field) term65806).setAccessible(true);
        Object enum166 = ((Field) term65806).get((Object) null);
        term61043 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term61043, 0, enum144);
        setElement(term61043, 1, enum145);
        setElement(term61043, 2, enum146);
        setElement(term61043, 3, enum147);
        setElement(term61043, 4, enum148);
        setElement(term61043, 5, enum149);
        setElement(term61043, 6, enum150);
        setElement(term61043, 7, enum151);
        setElement(term61043, 8, enum152);
        setElement(term61043, 9, enum153);
        setElement(term61043, 10, enum154);
        setElement(term61043, 11, enum155);
        setElement(term61043, 12, enum156);
        setElement(term61043, 13, enum157);
        setElement(term61043, 14, enum158);
        setElement(term61043, 15, enum159);
        setElement(term61043, 16, enum160);
        setElement(term61043, 17, enum161);
        setElement(term61043, 18, enum162);
        setElement(term61043, 19, enum163);
        setElement(term61043, 20, enum164);
        setElement(term61043, 21, enum165);
        setElement(term61043, 22, enum166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term61043));
    }

};


