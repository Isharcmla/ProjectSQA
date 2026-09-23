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

public class HtmlTreeBuilderState_values_76363456143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36922;

    public HtmlTreeBuilderState_values_76363456143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37245 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37244 = ((Class) term37245).getDeclaredField((String) "Initial");
        ((Field) term37244).setAccessible(true);
        Object enum88 = ((Field) term37244).get((Object) null);
        Class<? extends Object> term37458 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37457 = ((Class) term37458).getDeclaredField((String) "BeforeHtml");
        ((Field) term37457).setAccessible(true);
        Object enum89 = ((Field) term37457).get((Object) null);
        Class<? extends Object> term37680 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37679 = ((Class) term37680).getDeclaredField((String) "BeforeHead");
        ((Field) term37679).setAccessible(true);
        Object enum90 = ((Field) term37679).get((Object) null);
        Class<? extends Object> term37902 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37901 = ((Class) term37902).getDeclaredField((String) "InHead");
        ((Field) term37901).setAccessible(true);
        Object enum91 = ((Field) term37901).get((Object) null);
        Class<? extends Object> term38112 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38111 = ((Class) term38112).getDeclaredField((String) "InHeadNoscript");
        ((Field) term38111).setAccessible(true);
        Object enum92 = ((Field) term38111).get((Object) null);
        Class<? extends Object> term38346 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38345 = ((Class) term38346).getDeclaredField((String) "AfterHead");
        ((Field) term38345).setAccessible(true);
        Object enum93 = ((Field) term38345).get((Object) null);
        Class<? extends Object> term38565 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38564 = ((Class) term38565).getDeclaredField((String) "InBody");
        ((Field) term38564).setAccessible(true);
        Object enum94 = ((Field) term38564).get((Object) null);
        Class<? extends Object> term38775 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38774 = ((Class) term38775).getDeclaredField((String) "Text");
        ((Field) term38774).setAccessible(true);
        Object enum95 = ((Field) term38774).get((Object) null);
        Class<? extends Object> term38979 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38978 = ((Class) term38979).getDeclaredField((String) "InTable");
        ((Field) term38978).setAccessible(true);
        Object enum96 = ((Field) term38978).get((Object) null);
        Class<? extends Object> term39192 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39191 = ((Class) term39192).getDeclaredField((String) "InTableText");
        ((Field) term39191).setAccessible(true);
        Object enum97 = ((Field) term39191).get((Object) null);
        Class<? extends Object> term39417 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39416 = ((Class) term39417).getDeclaredField((String) "InCaption");
        ((Field) term39416).setAccessible(true);
        Object enum98 = ((Field) term39416).get((Object) null);
        Class<? extends Object> term39636 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39635 = ((Class) term39636).getDeclaredField((String) "InColumnGroup");
        ((Field) term39635).setAccessible(true);
        Object enum99 = ((Field) term39635).get((Object) null);
        Class<? extends Object> term39867 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term39866 = ((Class) term39867).getDeclaredField((String) "InTableBody");
        ((Field) term39866).setAccessible(true);
        Object enum100 = ((Field) term39866).get((Object) null);
        Class<? extends Object> term40092 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40091 = ((Class) term40092).getDeclaredField((String) "InRow");
        ((Field) term40091).setAccessible(true);
        Object enum101 = ((Field) term40091).get((Object) null);
        Class<? extends Object> term40299 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40298 = ((Class) term40299).getDeclaredField((String) "InCell");
        ((Field) term40298).setAccessible(true);
        Object enum102 = ((Field) term40298).get((Object) null);
        Class<? extends Object> term40509 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40508 = ((Class) term40509).getDeclaredField((String) "InSelect");
        ((Field) term40508).setAccessible(true);
        Object enum103 = ((Field) term40508).get((Object) null);
        Class<? extends Object> term40725 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40724 = ((Class) term40725).getDeclaredField((String) "InSelectInTable");
        ((Field) term40724).setAccessible(true);
        Object enum104 = ((Field) term40724).get((Object) null);
        Class<? extends Object> term40962 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40961 = ((Class) term40962).getDeclaredField((String) "AfterBody");
        ((Field) term40961).setAccessible(true);
        Object enum105 = ((Field) term40961).get((Object) null);
        Class<? extends Object> term41181 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41180 = ((Class) term41181).getDeclaredField((String) "InFrameset");
        ((Field) term41180).setAccessible(true);
        Object enum106 = ((Field) term41180).get((Object) null);
        Class<? extends Object> term41403 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41402 = ((Class) term41403).getDeclaredField((String) "AfterFrameset");
        ((Field) term41402).setAccessible(true);
        Object enum107 = ((Field) term41402).get((Object) null);
        Class<? extends Object> term41634 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41633 = ((Class) term41634).getDeclaredField((String) "AfterAfterBody");
        ((Field) term41633).setAccessible(true);
        Object enum108 = ((Field) term41633).get((Object) null);
        Class<? extends Object> term41868 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term41867 = ((Class) term41868).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term41867).setAccessible(true);
        Object enum109 = ((Field) term41867).get((Object) null);
        Class<? extends Object> term42114 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term42113 = ((Class) term42114).getDeclaredField((String) "ForeignContent");
        ((Field) term42113).setAccessible(true);
        Object enum110 = ((Field) term42113).get((Object) null);
        term36922 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term36922, 0, enum88);
        setElement(term36922, 1, enum89);
        setElement(term36922, 2, enum90);
        setElement(term36922, 3, enum91);
        setElement(term36922, 4, enum92);
        setElement(term36922, 5, enum93);
        setElement(term36922, 6, enum94);
        setElement(term36922, 7, enum95);
        setElement(term36922, 8, enum96);
        setElement(term36922, 9, enum97);
        setElement(term36922, 10, enum98);
        setElement(term36922, 11, enum99);
        setElement(term36922, 12, enum100);
        setElement(term36922, 13, enum101);
        setElement(term36922, 14, enum102);
        setElement(term36922, 15, enum103);
        setElement(term36922, 16, enum104);
        setElement(term36922, 17, enum105);
        setElement(term36922, 18, enum106);
        setElement(term36922, 19, enum107);
        setElement(term36922, 20, enum108);
        setElement(term36922, 21, enum109);
        setElement(term36922, 22, enum110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term36922));
    }

};


