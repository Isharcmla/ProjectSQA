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
     Object term57164;

    public HtmlTreeBuilderState_values_76363456167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57487 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57486 = ((Class) term57487).getDeclaredField((String) "Initial");
        ((Field) term57486).setAccessible(true);
        Object enum157 = ((Field) term57486).get((Object) null);
        Class<? extends Object> term57700 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57699 = ((Class) term57700).getDeclaredField((String) "BeforeHtml");
        ((Field) term57699).setAccessible(true);
        Object enum158 = ((Field) term57699).get((Object) null);
        Class<? extends Object> term57922 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57921 = ((Class) term57922).getDeclaredField((String) "BeforeHead");
        ((Field) term57921).setAccessible(true);
        Object enum159 = ((Field) term57921).get((Object) null);
        Class<? extends Object> term58144 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58143 = ((Class) term58144).getDeclaredField((String) "InHead");
        ((Field) term58143).setAccessible(true);
        Object enum160 = ((Field) term58143).get((Object) null);
        Class<? extends Object> term58354 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58353 = ((Class) term58354).getDeclaredField((String) "InHeadNoscript");
        ((Field) term58353).setAccessible(true);
        Object enum161 = ((Field) term58353).get((Object) null);
        Class<? extends Object> term58588 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58587 = ((Class) term58588).getDeclaredField((String) "AfterHead");
        ((Field) term58587).setAccessible(true);
        Object enum162 = ((Field) term58587).get((Object) null);
        Class<? extends Object> term58807 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58806 = ((Class) term58807).getDeclaredField((String) "InBody");
        ((Field) term58806).setAccessible(true);
        Object enum163 = ((Field) term58806).get((Object) null);
        Class<? extends Object> term59017 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59016 = ((Class) term59017).getDeclaredField((String) "Text");
        ((Field) term59016).setAccessible(true);
        Object enum164 = ((Field) term59016).get((Object) null);
        Class<? extends Object> term59221 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59220 = ((Class) term59221).getDeclaredField((String) "InTable");
        ((Field) term59220).setAccessible(true);
        Object enum165 = ((Field) term59220).get((Object) null);
        Class<? extends Object> term59434 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59433 = ((Class) term59434).getDeclaredField((String) "InTableText");
        ((Field) term59433).setAccessible(true);
        Object enum166 = ((Field) term59433).get((Object) null);
        Class<? extends Object> term59659 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59658 = ((Class) term59659).getDeclaredField((String) "InCaption");
        ((Field) term59658).setAccessible(true);
        Object enum167 = ((Field) term59658).get((Object) null);
        Class<? extends Object> term59878 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59877 = ((Class) term59878).getDeclaredField((String) "InColumnGroup");
        ((Field) term59877).setAccessible(true);
        Object enum168 = ((Field) term59877).get((Object) null);
        Class<? extends Object> term60109 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term60108 = ((Class) term60109).getDeclaredField((String) "InTableBody");
        ((Field) term60108).setAccessible(true);
        Object enum169 = ((Field) term60108).get((Object) null);
        Class<? extends Object> term60334 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term60333 = ((Class) term60334).getDeclaredField((String) "InRow");
        ((Field) term60333).setAccessible(true);
        Object enum170 = ((Field) term60333).get((Object) null);
        Class<? extends Object> term60541 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term60540 = ((Class) term60541).getDeclaredField((String) "InCell");
        ((Field) term60540).setAccessible(true);
        Object enum171 = ((Field) term60540).get((Object) null);
        Class<? extends Object> term60751 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term60750 = ((Class) term60751).getDeclaredField((String) "InSelect");
        ((Field) term60750).setAccessible(true);
        Object enum172 = ((Field) term60750).get((Object) null);
        Class<? extends Object> term60967 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term60966 = ((Class) term60967).getDeclaredField((String) "InSelectInTable");
        ((Field) term60966).setAccessible(true);
        Object enum173 = ((Field) term60966).get((Object) null);
        Class<? extends Object> term61204 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term61203 = ((Class) term61204).getDeclaredField((String) "AfterBody");
        ((Field) term61203).setAccessible(true);
        Object enum174 = ((Field) term61203).get((Object) null);
        Class<? extends Object> term61423 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term61422 = ((Class) term61423).getDeclaredField((String) "InFrameset");
        ((Field) term61422).setAccessible(true);
        Object enum175 = ((Field) term61422).get((Object) null);
        Class<? extends Object> term61645 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term61644 = ((Class) term61645).getDeclaredField((String) "AfterFrameset");
        ((Field) term61644).setAccessible(true);
        Object enum176 = ((Field) term61644).get((Object) null);
        Class<? extends Object> term61876 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term61875 = ((Class) term61876).getDeclaredField((String) "AfterAfterBody");
        ((Field) term61875).setAccessible(true);
        Object enum177 = ((Field) term61875).get((Object) null);
        Class<? extends Object> term62110 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term62109 = ((Class) term62110).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term62109).setAccessible(true);
        Object enum178 = ((Field) term62109).get((Object) null);
        Class<? extends Object> term62356 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term62355 = ((Class) term62356).getDeclaredField((String) "ForeignContent");
        ((Field) term62355).setAccessible(true);
        Object enum179 = ((Field) term62355).get((Object) null);
        term57164 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term57164, 0, enum157);
        setElement(term57164, 1, enum158);
        setElement(term57164, 2, enum159);
        setElement(term57164, 3, enum160);
        setElement(term57164, 4, enum161);
        setElement(term57164, 5, enum162);
        setElement(term57164, 6, enum163);
        setElement(term57164, 7, enum164);
        setElement(term57164, 8, enum165);
        setElement(term57164, 9, enum166);
        setElement(term57164, 10, enum167);
        setElement(term57164, 11, enum168);
        setElement(term57164, 12, enum169);
        setElement(term57164, 13, enum170);
        setElement(term57164, 14, enum171);
        setElement(term57164, 15, enum172);
        setElement(term57164, 16, enum173);
        setElement(term57164, 17, enum174);
        setElement(term57164, 18, enum175);
        setElement(term57164, 19, enum176);
        setElement(term57164, 20, enum177);
        setElement(term57164, 21, enum178);
        setElement(term57164, 22, enum179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term57164));
    }

};


