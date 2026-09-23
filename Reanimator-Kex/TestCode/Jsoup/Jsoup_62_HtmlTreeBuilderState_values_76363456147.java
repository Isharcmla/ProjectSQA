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

public class HtmlTreeBuilderState_values_76363456147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37348;

    public HtmlTreeBuilderState_values_76363456147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37671 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37670 = ((Class) term37671).getDeclaredField((String) "Initial");
        ((Field) term37670).setAccessible(true);
        Object enum110 = ((Field) term37670).get((Object) null);
        Class<? extends Object> term37884 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37883 = ((Class) term37884).getDeclaredField((String) "BeforeHtml");
        ((Field) term37883).setAccessible(true);
        Object enum111 = ((Field) term37883).get((Object) null);
        Class<? extends Object> term38106 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38105 = ((Class) term38106).getDeclaredField((String) "BeforeHead");
        ((Field) term38105).setAccessible(true);
        Object enum112 = ((Field) term38105).get((Object) null);
        Class<? extends Object> term38328 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38327 = ((Class) term38328).getDeclaredField((String) "InHead");
        ((Field) term38327).setAccessible(true);
        Object enum113 = ((Field) term38327).get((Object) null);
        Class<? extends Object> term38538 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38537 = ((Class) term38538).getDeclaredField((String) "InHeadNoscript");
        ((Field) term38537).setAccessible(true);
        Object enum114 = ((Field) term38537).get((Object) null);
        Class<? extends Object> term38772 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38771 = ((Class) term38772).getDeclaredField((String) "AfterHead");
        ((Field) term38771).setAccessible(true);
        Object enum115 = ((Field) term38771).get((Object) null);
        Class<? extends Object> term38991 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38990 = ((Class) term38991).getDeclaredField((String) "InBody");
        ((Field) term38990).setAccessible(true);
        Object enum116 = ((Field) term38990).get((Object) null);
        Class<? extends Object> term39202 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39201 = ((Class) term39202).getDeclaredField((String) "Text");
        ((Field) term39201).setAccessible(true);
        Object enum117 = ((Field) term39201).get((Object) null);
        Class<? extends Object> term39406 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39405 = ((Class) term39406).getDeclaredField((String) "InTable");
        ((Field) term39405).setAccessible(true);
        Object enum118 = ((Field) term39405).get((Object) null);
        Class<? extends Object> term39619 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39618 = ((Class) term39619).getDeclaredField((String) "InTableText");
        ((Field) term39618).setAccessible(true);
        Object enum119 = ((Field) term39618).get((Object) null);
        Class<? extends Object> term39844 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39843 = ((Class) term39844).getDeclaredField((String) "InCaption");
        ((Field) term39843).setAccessible(true);
        Object enum120 = ((Field) term39843).get((Object) null);
        Class<? extends Object> term40063 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40062 = ((Class) term40063).getDeclaredField((String) "InColumnGroup");
        ((Field) term40062).setAccessible(true);
        Object enum121 = ((Field) term40062).get((Object) null);
        Class<? extends Object> term40294 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40293 = ((Class) term40294).getDeclaredField((String) "InTableBody");
        ((Field) term40293).setAccessible(true);
        Object enum122 = ((Field) term40293).get((Object) null);
        Class<? extends Object> term40519 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40518 = ((Class) term40519).getDeclaredField((String) "InRow");
        ((Field) term40518).setAccessible(true);
        Object enum123 = ((Field) term40518).get((Object) null);
        Class<? extends Object> term40726 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40725 = ((Class) term40726).getDeclaredField((String) "InCell");
        ((Field) term40725).setAccessible(true);
        Object enum124 = ((Field) term40725).get((Object) null);
        Class<? extends Object> term40936 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40935 = ((Class) term40936).getDeclaredField((String) "InSelect");
        ((Field) term40935).setAccessible(true);
        Object enum125 = ((Field) term40935).get((Object) null);
        Class<? extends Object> term41152 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41151 = ((Class) term41152).getDeclaredField((String) "InSelectInTable");
        ((Field) term41151).setAccessible(true);
        Object enum126 = ((Field) term41151).get((Object) null);
        Class<? extends Object> term41389 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41388 = ((Class) term41389).getDeclaredField((String) "AfterBody");
        ((Field) term41388).setAccessible(true);
        Object enum127 = ((Field) term41388).get((Object) null);
        Class<? extends Object> term41608 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41607 = ((Class) term41608).getDeclaredField((String) "InFrameset");
        ((Field) term41607).setAccessible(true);
        Object enum128 = ((Field) term41607).get((Object) null);
        Class<? extends Object> term41830 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41829 = ((Class) term41830).getDeclaredField((String) "AfterFrameset");
        ((Field) term41829).setAccessible(true);
        Object enum129 = ((Field) term41829).get((Object) null);
        Class<? extends Object> term42061 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term42060 = ((Class) term42061).getDeclaredField((String) "AfterAfterBody");
        ((Field) term42060).setAccessible(true);
        Object enum130 = ((Field) term42060).get((Object) null);
        Class<? extends Object> term42295 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term42294 = ((Class) term42295).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term42294).setAccessible(true);
        Object enum131 = ((Field) term42294).get((Object) null);
        Class<? extends Object> term42541 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term42540 = ((Class) term42541).getDeclaredField((String) "ForeignContent");
        ((Field) term42540).setAccessible(true);
        Object enum132 = ((Field) term42540).get((Object) null);
        term37348 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term37348, 0, enum110);
        setElement(term37348, 1, enum111);
        setElement(term37348, 2, enum112);
        setElement(term37348, 3, enum113);
        setElement(term37348, 4, enum114);
        setElement(term37348, 5, enum115);
        setElement(term37348, 6, enum116);
        setElement(term37348, 7, enum117);
        setElement(term37348, 8, enum118);
        setElement(term37348, 9, enum119);
        setElement(term37348, 10, enum120);
        setElement(term37348, 11, enum121);
        setElement(term37348, 12, enum122);
        setElement(term37348, 13, enum123);
        setElement(term37348, 14, enum124);
        setElement(term37348, 15, enum125);
        setElement(term37348, 16, enum126);
        setElement(term37348, 17, enum127);
        setElement(term37348, 18, enum128);
        setElement(term37348, 19, enum129);
        setElement(term37348, 20, enum130);
        setElement(term37348, 21, enum131);
        setElement(term37348, 22, enum132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term37348));
    }

};


