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

public class TreeBuilderState_values_140903369547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83487;

    public TreeBuilderState_values_140903369547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83810 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term83809 = ((Class) term83810).getDeclaredField((String) "Initial");
        ((Field) term83809).setAccessible(true);
        Object enum141 = ((Field) term83809).get((Object) null);
        Class<? extends Object> term84003 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term84002 = ((Class) term84003).getDeclaredField((String) "BeforeHtml");
        ((Field) term84002).setAccessible(true);
        Object enum142 = ((Field) term84002).get((Object) null);
        Class<? extends Object> term84205 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term84204 = ((Class) term84205).getDeclaredField((String) "BeforeHead");
        ((Field) term84204).setAccessible(true);
        Object enum143 = ((Field) term84204).get((Object) null);
        Class<? extends Object> term84407 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term84406 = ((Class) term84407).getDeclaredField((String) "InHead");
        ((Field) term84406).setAccessible(true);
        Object enum144 = ((Field) term84406).get((Object) null);
        Class<? extends Object> term84597 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term84596 = ((Class) term84597).getDeclaredField((String) "InHeadNoscript");
        ((Field) term84596).setAccessible(true);
        Object enum145 = ((Field) term84596).get((Object) null);
        Class<? extends Object> term84811 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term84810 = ((Class) term84811).getDeclaredField((String) "AfterHead");
        ((Field) term84810).setAccessible(true);
        Object enum146 = ((Field) term84810).get((Object) null);
        Class<? extends Object> term85010 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term85009 = ((Class) term85010).getDeclaredField((String) "InBody");
        ((Field) term85009).setAccessible(true);
        Object enum147 = ((Field) term85009).get((Object) null);
        Class<? extends Object> term85200 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term85199 = ((Class) term85200).getDeclaredField((String) "Text");
        ((Field) term85199).setAccessible(true);
        Object enum148 = ((Field) term85199).get((Object) null);
        Class<? extends Object> term85384 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term85383 = ((Class) term85384).getDeclaredField((String) "InTable");
        ((Field) term85383).setAccessible(true);
        Object enum149 = ((Field) term85383).get((Object) null);
        Class<? extends Object> term85577 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term85576 = ((Class) term85577).getDeclaredField((String) "InTableText");
        ((Field) term85576).setAccessible(true);
        Object enum150 = ((Field) term85576).get((Object) null);
        Class<? extends Object> term85782 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term85781 = ((Class) term85782).getDeclaredField((String) "InCaption");
        ((Field) term85781).setAccessible(true);
        Object enum151 = ((Field) term85781).get((Object) null);
        Class<? extends Object> term85981 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term85980 = ((Class) term85981).getDeclaredField((String) "InColumnGroup");
        ((Field) term85980).setAccessible(true);
        Object enum152 = ((Field) term85980).get((Object) null);
        Class<? extends Object> term86192 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term86191 = ((Class) term86192).getDeclaredField((String) "InTableBody");
        ((Field) term86191).setAccessible(true);
        Object enum153 = ((Field) term86191).get((Object) null);
        Class<? extends Object> term86397 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term86396 = ((Class) term86397).getDeclaredField((String) "InRow");
        ((Field) term86396).setAccessible(true);
        Object enum154 = ((Field) term86396).get((Object) null);
        Class<? extends Object> term86584 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term86583 = ((Class) term86584).getDeclaredField((String) "InCell");
        ((Field) term86583).setAccessible(true);
        Object enum155 = ((Field) term86583).get((Object) null);
        Class<? extends Object> term86774 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term86773 = ((Class) term86774).getDeclaredField((String) "InSelect");
        ((Field) term86773).setAccessible(true);
        Object enum156 = ((Field) term86773).get((Object) null);
        Class<? extends Object> term86970 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term86969 = ((Class) term86970).getDeclaredField((String) "InSelectInTable");
        ((Field) term86969).setAccessible(true);
        Object enum157 = ((Field) term86969).get((Object) null);
        Class<? extends Object> term87187 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term87186 = ((Class) term87187).getDeclaredField((String) "AfterBody");
        ((Field) term87186).setAccessible(true);
        Object enum158 = ((Field) term87186).get((Object) null);
        Class<? extends Object> term87386 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term87385 = ((Class) term87386).getDeclaredField((String) "InFrameset");
        ((Field) term87385).setAccessible(true);
        Object enum159 = ((Field) term87385).get((Object) null);
        Class<? extends Object> term87588 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term87587 = ((Class) term87588).getDeclaredField((String) "AfterFrameset");
        ((Field) term87587).setAccessible(true);
        Object enum160 = ((Field) term87587).get((Object) null);
        Class<? extends Object> term87801 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term87800 = ((Class) term87801).getDeclaredField((String) "AfterAfterBody");
        ((Field) term87800).setAccessible(true);
        Object enum161 = ((Field) term87800).get((Object) null);
        Class<? extends Object> term88018 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term88017 = ((Class) term88018).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term88017).setAccessible(true);
        Object enum162 = ((Field) term88017).get((Object) null);
        Class<? extends Object> term88244 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term88243 = ((Class) term88244).getDeclaredField((String) "ForeignContent");
        ((Field) term88243).setAccessible(true);
        Object enum163 = ((Field) term88243).get((Object) null);
        term83487 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term83487, 0, enum141);
        setElement(term83487, 1, enum142);
        setElement(term83487, 2, enum143);
        setElement(term83487, 3, enum144);
        setElement(term83487, 4, enum145);
        setElement(term83487, 5, enum146);
        setElement(term83487, 6, enum147);
        setElement(term83487, 7, enum148);
        setElement(term83487, 8, enum149);
        setElement(term83487, 9, enum150);
        setElement(term83487, 10, enum151);
        setElement(term83487, 11, enum152);
        setElement(term83487, 12, enum153);
        setElement(term83487, 13, enum154);
        setElement(term83487, 14, enum155);
        setElement(term83487, 15, enum156);
        setElement(term83487, 16, enum157);
        setElement(term83487, 17, enum158);
        setElement(term83487, 18, enum159);
        setElement(term83487, 19, enum160);
        setElement(term83487, 20, enum161);
        setElement(term83487, 21, enum162);
        setElement(term83487, 22, enum163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term83487));
    }

};


