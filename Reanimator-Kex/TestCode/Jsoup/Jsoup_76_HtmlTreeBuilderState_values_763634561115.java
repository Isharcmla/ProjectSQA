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

public class HtmlTreeBuilderState_values_763634561115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73762;

    public HtmlTreeBuilderState_values_763634561115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74085 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term74084 = ((Class) term74085).getDeclaredField((String) "Initial");
        ((Field) term74084).setAccessible(true);
        Object enum169 = ((Field) term74084).get((Object) null);
        Class<? extends Object> term74298 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term74297 = ((Class) term74298).getDeclaredField((String) "BeforeHtml");
        ((Field) term74297).setAccessible(true);
        Object enum170 = ((Field) term74297).get((Object) null);
        Class<? extends Object> term74520 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term74519 = ((Class) term74520).getDeclaredField((String) "BeforeHead");
        ((Field) term74519).setAccessible(true);
        Object enum171 = ((Field) term74519).get((Object) null);
        Class<? extends Object> term74742 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term74741 = ((Class) term74742).getDeclaredField((String) "InHead");
        ((Field) term74741).setAccessible(true);
        Object enum172 = ((Field) term74741).get((Object) null);
        Class<? extends Object> term74952 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term74951 = ((Class) term74952).getDeclaredField((String) "InHeadNoscript");
        ((Field) term74951).setAccessible(true);
        Object enum173 = ((Field) term74951).get((Object) null);
        Class<? extends Object> term75186 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term75185 = ((Class) term75186).getDeclaredField((String) "AfterHead");
        ((Field) term75185).setAccessible(true);
        Object enum174 = ((Field) term75185).get((Object) null);
        Class<? extends Object> term75405 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term75404 = ((Class) term75405).getDeclaredField((String) "InBody");
        ((Field) term75404).setAccessible(true);
        Object enum175 = ((Field) term75404).get((Object) null);
        Class<? extends Object> term75615 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term75614 = ((Class) term75615).getDeclaredField((String) "Text");
        ((Field) term75614).setAccessible(true);
        Object enum176 = ((Field) term75614).get((Object) null);
        Class<? extends Object> term75823 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term75822 = ((Class) term75823).getDeclaredField((String) "InTable");
        ((Field) term75822).setAccessible(true);
        Object enum177 = ((Field) term75822).get((Object) null);
        Class<? extends Object> term76046 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term76045 = ((Class) term76046).getDeclaredField((String) "InTableText");
        ((Field) term76045).setAccessible(true);
        Object enum178 = ((Field) term76045).get((Object) null);
        Class<? extends Object> term76271 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term76270 = ((Class) term76271).getDeclaredField((String) "InCaption");
        ((Field) term76270).setAccessible(true);
        Object enum179 = ((Field) term76270).get((Object) null);
        Class<? extends Object> term76490 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term76489 = ((Class) term76490).getDeclaredField((String) "InColumnGroup");
        ((Field) term76489).setAccessible(true);
        Object enum180 = ((Field) term76489).get((Object) null);
        Class<? extends Object> term76721 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term76720 = ((Class) term76721).getDeclaredField((String) "InTableBody");
        ((Field) term76720).setAccessible(true);
        Object enum181 = ((Field) term76720).get((Object) null);
        Class<? extends Object> term76946 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term76945 = ((Class) term76946).getDeclaredField((String) "InRow");
        ((Field) term76945).setAccessible(true);
        Object enum182 = ((Field) term76945).get((Object) null);
        Class<? extends Object> term77153 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term77152 = ((Class) term77153).getDeclaredField((String) "InCell");
        ((Field) term77152).setAccessible(true);
        Object enum183 = ((Field) term77152).get((Object) null);
        Class<? extends Object> term77363 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term77362 = ((Class) term77363).getDeclaredField((String) "InSelect");
        ((Field) term77362).setAccessible(true);
        Object enum184 = ((Field) term77362).get((Object) null);
        Class<? extends Object> term77579 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term77578 = ((Class) term77579).getDeclaredField((String) "InSelectInTable");
        ((Field) term77578).setAccessible(true);
        Object enum185 = ((Field) term77578).get((Object) null);
        Class<? extends Object> term77816 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term77815 = ((Class) term77816).getDeclaredField((String) "AfterBody");
        ((Field) term77815).setAccessible(true);
        Object enum186 = ((Field) term77815).get((Object) null);
        Class<? extends Object> term78035 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term78034 = ((Class) term78035).getDeclaredField((String) "InFrameset");
        ((Field) term78034).setAccessible(true);
        Object enum187 = ((Field) term78034).get((Object) null);
        Class<? extends Object> term78257 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term78256 = ((Class) term78257).getDeclaredField((String) "AfterFrameset");
        ((Field) term78256).setAccessible(true);
        Object enum188 = ((Field) term78256).get((Object) null);
        Class<? extends Object> term78488 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term78487 = ((Class) term78488).getDeclaredField((String) "AfterAfterBody");
        ((Field) term78487).setAccessible(true);
        Object enum189 = ((Field) term78487).get((Object) null);
        Class<? extends Object> term78722 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term78721 = ((Class) term78722).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term78721).setAccessible(true);
        Object enum190 = ((Field) term78721).get((Object) null);
        Class<? extends Object> term78968 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term78967 = ((Class) term78968).getDeclaredField((String) "ForeignContent");
        ((Field) term78967).setAccessible(true);
        Object enum191 = ((Field) term78967).get((Object) null);
        term73762 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term73762, 0, enum169);
        setElement(term73762, 1, enum170);
        setElement(term73762, 2, enum171);
        setElement(term73762, 3, enum172);
        setElement(term73762, 4, enum173);
        setElement(term73762, 5, enum174);
        setElement(term73762, 6, enum175);
        setElement(term73762, 7, enum176);
        setElement(term73762, 8, enum177);
        setElement(term73762, 9, enum178);
        setElement(term73762, 10, enum179);
        setElement(term73762, 11, enum180);
        setElement(term73762, 12, enum181);
        setElement(term73762, 13, enum182);
        setElement(term73762, 14, enum183);
        setElement(term73762, 15, enum184);
        setElement(term73762, 16, enum185);
        setElement(term73762, 17, enum186);
        setElement(term73762, 18, enum187);
        setElement(term73762, 19, enum188);
        setElement(term73762, 20, enum189);
        setElement(term73762, 21, enum190);
        setElement(term73762, 22, enum191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term73762));
    }

};


