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

public class HtmlTreeBuilderState_values_76363456167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69613;

    public HtmlTreeBuilderState_values_76363456167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69936 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term69935 = ((Class) term69936).getDeclaredField((String) "Initial");
        ((Field) term69935).setAccessible(true);
        Object enum163 = ((Field) term69935).get((Object) null);
        Class<? extends Object> term70149 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term70148 = ((Class) term70149).getDeclaredField((String) "BeforeHtml");
        ((Field) term70148).setAccessible(true);
        Object enum164 = ((Field) term70148).get((Object) null);
        Class<? extends Object> term70371 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term70370 = ((Class) term70371).getDeclaredField((String) "BeforeHead");
        ((Field) term70370).setAccessible(true);
        Object enum165 = ((Field) term70370).get((Object) null);
        Class<? extends Object> term70593 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term70592 = ((Class) term70593).getDeclaredField((String) "InHead");
        ((Field) term70592).setAccessible(true);
        Object enum166 = ((Field) term70592).get((Object) null);
        Class<? extends Object> term70803 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term70802 = ((Class) term70803).getDeclaredField((String) "InHeadNoscript");
        ((Field) term70802).setAccessible(true);
        Object enum167 = ((Field) term70802).get((Object) null);
        Class<? extends Object> term71037 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term71036 = ((Class) term71037).getDeclaredField((String) "AfterHead");
        ((Field) term71036).setAccessible(true);
        Object enum168 = ((Field) term71036).get((Object) null);
        Class<? extends Object> term71256 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term71255 = ((Class) term71256).getDeclaredField((String) "InBody");
        ((Field) term71255).setAccessible(true);
        Object enum169 = ((Field) term71255).get((Object) null);
        Class<? extends Object> term71466 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term71465 = ((Class) term71466).getDeclaredField((String) "Text");
        ((Field) term71465).setAccessible(true);
        Object enum170 = ((Field) term71465).get((Object) null);
        Class<? extends Object> term71670 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term71669 = ((Class) term71670).getDeclaredField((String) "InTable");
        ((Field) term71669).setAccessible(true);
        Object enum171 = ((Field) term71669).get((Object) null);
        Class<? extends Object> term71883 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term71882 = ((Class) term71883).getDeclaredField((String) "InTableText");
        ((Field) term71882).setAccessible(true);
        Object enum172 = ((Field) term71882).get((Object) null);
        Class<? extends Object> term72108 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term72107 = ((Class) term72108).getDeclaredField((String) "InCaption");
        ((Field) term72107).setAccessible(true);
        Object enum173 = ((Field) term72107).get((Object) null);
        Class<? extends Object> term72327 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term72326 = ((Class) term72327).getDeclaredField((String) "InColumnGroup");
        ((Field) term72326).setAccessible(true);
        Object enum174 = ((Field) term72326).get((Object) null);
        Class<? extends Object> term72558 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term72557 = ((Class) term72558).getDeclaredField((String) "InTableBody");
        ((Field) term72557).setAccessible(true);
        Object enum175 = ((Field) term72557).get((Object) null);
        Class<? extends Object> term72783 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term72782 = ((Class) term72783).getDeclaredField((String) "InRow");
        ((Field) term72782).setAccessible(true);
        Object enum176 = ((Field) term72782).get((Object) null);
        Class<? extends Object> term72990 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term72989 = ((Class) term72990).getDeclaredField((String) "InCell");
        ((Field) term72989).setAccessible(true);
        Object enum177 = ((Field) term72989).get((Object) null);
        Class<? extends Object> term73200 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term73199 = ((Class) term73200).getDeclaredField((String) "InSelect");
        ((Field) term73199).setAccessible(true);
        Object enum178 = ((Field) term73199).get((Object) null);
        Class<? extends Object> term73416 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term73415 = ((Class) term73416).getDeclaredField((String) "InSelectInTable");
        ((Field) term73415).setAccessible(true);
        Object enum179 = ((Field) term73415).get((Object) null);
        Class<? extends Object> term73653 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term73652 = ((Class) term73653).getDeclaredField((String) "AfterBody");
        ((Field) term73652).setAccessible(true);
        Object enum180 = ((Field) term73652).get((Object) null);
        Class<? extends Object> term73872 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term73871 = ((Class) term73872).getDeclaredField((String) "InFrameset");
        ((Field) term73871).setAccessible(true);
        Object enum181 = ((Field) term73871).get((Object) null);
        Class<? extends Object> term74094 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term74093 = ((Class) term74094).getDeclaredField((String) "AfterFrameset");
        ((Field) term74093).setAccessible(true);
        Object enum182 = ((Field) term74093).get((Object) null);
        Class<? extends Object> term74325 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term74324 = ((Class) term74325).getDeclaredField((String) "AfterAfterBody");
        ((Field) term74324).setAccessible(true);
        Object enum183 = ((Field) term74324).get((Object) null);
        Class<? extends Object> term74559 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term74558 = ((Class) term74559).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term74558).setAccessible(true);
        Object enum184 = ((Field) term74558).get((Object) null);
        Class<? extends Object> term74805 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term74804 = ((Class) term74805).getDeclaredField((String) "ForeignContent");
        ((Field) term74804).setAccessible(true);
        Object enum185 = ((Field) term74804).get((Object) null);
        term69613 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term69613, 0, enum163);
        setElement(term69613, 1, enum164);
        setElement(term69613, 2, enum165);
        setElement(term69613, 3, enum166);
        setElement(term69613, 4, enum167);
        setElement(term69613, 5, enum168);
        setElement(term69613, 6, enum169);
        setElement(term69613, 7, enum170);
        setElement(term69613, 8, enum171);
        setElement(term69613, 9, enum172);
        setElement(term69613, 10, enum173);
        setElement(term69613, 11, enum174);
        setElement(term69613, 12, enum175);
        setElement(term69613, 13, enum176);
        setElement(term69613, 14, enum177);
        setElement(term69613, 15, enum178);
        setElement(term69613, 16, enum179);
        setElement(term69613, 17, enum180);
        setElement(term69613, 18, enum181);
        setElement(term69613, 19, enum182);
        setElement(term69613, 20, enum183);
        setElement(term69613, 21, enum184);
        setElement(term69613, 22, enum185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term69613));
    }

};


