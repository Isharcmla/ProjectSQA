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

public class HtmlTreeBuilderState_values_76363456123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35663;

    public HtmlTreeBuilderState_values_76363456123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35986 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35985 = ((Class) term35986).getDeclaredField((String) "Initial");
        ((Field) term35985).setAccessible(true);
        Object enum112 = ((Field) term35985).get((Object) null);
        Class<? extends Object> term36199 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36198 = ((Class) term36199).getDeclaredField((String) "BeforeHtml");
        ((Field) term36198).setAccessible(true);
        Object enum113 = ((Field) term36198).get((Object) null);
        Class<? extends Object> term36421 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36420 = ((Class) term36421).getDeclaredField((String) "BeforeHead");
        ((Field) term36420).setAccessible(true);
        Object enum114 = ((Field) term36420).get((Object) null);
        Class<? extends Object> term36643 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36642 = ((Class) term36643).getDeclaredField((String) "InHead");
        ((Field) term36642).setAccessible(true);
        Object enum115 = ((Field) term36642).get((Object) null);
        Class<? extends Object> term36853 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36852 = ((Class) term36853).getDeclaredField((String) "InHeadNoscript");
        ((Field) term36852).setAccessible(true);
        Object enum116 = ((Field) term36852).get((Object) null);
        Class<? extends Object> term37087 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37086 = ((Class) term37087).getDeclaredField((String) "AfterHead");
        ((Field) term37086).setAccessible(true);
        Object enum117 = ((Field) term37086).get((Object) null);
        Class<? extends Object> term37306 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37305 = ((Class) term37306).getDeclaredField((String) "InBody");
        ((Field) term37305).setAccessible(true);
        Object enum118 = ((Field) term37305).get((Object) null);
        Class<? extends Object> term37516 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37515 = ((Class) term37516).getDeclaredField((String) "Text");
        ((Field) term37515).setAccessible(true);
        Object enum119 = ((Field) term37515).get((Object) null);
        Class<? extends Object> term37720 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37719 = ((Class) term37720).getDeclaredField((String) "InTable");
        ((Field) term37719).setAccessible(true);
        Object enum120 = ((Field) term37719).get((Object) null);
        Class<? extends Object> term37933 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37932 = ((Class) term37933).getDeclaredField((String) "InTableText");
        ((Field) term37932).setAccessible(true);
        Object enum121 = ((Field) term37932).get((Object) null);
        Class<? extends Object> term38158 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38157 = ((Class) term38158).getDeclaredField((String) "InCaption");
        ((Field) term38157).setAccessible(true);
        Object enum122 = ((Field) term38157).get((Object) null);
        Class<? extends Object> term38377 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38376 = ((Class) term38377).getDeclaredField((String) "InColumnGroup");
        ((Field) term38376).setAccessible(true);
        Object enum123 = ((Field) term38376).get((Object) null);
        Class<? extends Object> term38608 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38607 = ((Class) term38608).getDeclaredField((String) "InTableBody");
        ((Field) term38607).setAccessible(true);
        Object enum124 = ((Field) term38607).get((Object) null);
        Class<? extends Object> term38833 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38832 = ((Class) term38833).getDeclaredField((String) "InRow");
        ((Field) term38832).setAccessible(true);
        Object enum125 = ((Field) term38832).get((Object) null);
        Class<? extends Object> term39040 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39039 = ((Class) term39040).getDeclaredField((String) "InCell");
        ((Field) term39039).setAccessible(true);
        Object enum126 = ((Field) term39039).get((Object) null);
        Class<? extends Object> term39250 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39249 = ((Class) term39250).getDeclaredField((String) "InSelect");
        ((Field) term39249).setAccessible(true);
        Object enum127 = ((Field) term39249).get((Object) null);
        Class<? extends Object> term39466 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39465 = ((Class) term39466).getDeclaredField((String) "InSelectInTable");
        ((Field) term39465).setAccessible(true);
        Object enum128 = ((Field) term39465).get((Object) null);
        Class<? extends Object> term39703 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39702 = ((Class) term39703).getDeclaredField((String) "AfterBody");
        ((Field) term39702).setAccessible(true);
        Object enum129 = ((Field) term39702).get((Object) null);
        Class<? extends Object> term39922 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39921 = ((Class) term39922).getDeclaredField((String) "InFrameset");
        ((Field) term39921).setAccessible(true);
        Object enum130 = ((Field) term39921).get((Object) null);
        Class<? extends Object> term40144 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40143 = ((Class) term40144).getDeclaredField((String) "AfterFrameset");
        ((Field) term40143).setAccessible(true);
        Object enum131 = ((Field) term40143).get((Object) null);
        Class<? extends Object> term40375 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40374 = ((Class) term40375).getDeclaredField((String) "AfterAfterBody");
        ((Field) term40374).setAccessible(true);
        Object enum132 = ((Field) term40374).get((Object) null);
        Class<? extends Object> term40609 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40608 = ((Class) term40609).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term40608).setAccessible(true);
        Object enum133 = ((Field) term40608).get((Object) null);
        Class<? extends Object> term40855 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40854 = ((Class) term40855).getDeclaredField((String) "ForeignContent");
        ((Field) term40854).setAccessible(true);
        Object enum134 = ((Field) term40854).get((Object) null);
        term35663 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term35663, 0, enum112);
        setElement(term35663, 1, enum113);
        setElement(term35663, 2, enum114);
        setElement(term35663, 3, enum115);
        setElement(term35663, 4, enum116);
        setElement(term35663, 5, enum117);
        setElement(term35663, 6, enum118);
        setElement(term35663, 7, enum119);
        setElement(term35663, 8, enum120);
        setElement(term35663, 9, enum121);
        setElement(term35663, 10, enum122);
        setElement(term35663, 11, enum123);
        setElement(term35663, 12, enum124);
        setElement(term35663, 13, enum125);
        setElement(term35663, 14, enum126);
        setElement(term35663, 15, enum127);
        setElement(term35663, 16, enum128);
        setElement(term35663, 17, enum129);
        setElement(term35663, 18, enum130);
        setElement(term35663, 19, enum131);
        setElement(term35663, 20, enum132);
        setElement(term35663, 21, enum133);
        setElement(term35663, 22, enum134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term35663));
    }

};


