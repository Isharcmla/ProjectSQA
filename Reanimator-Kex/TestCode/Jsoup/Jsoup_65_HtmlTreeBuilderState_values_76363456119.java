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

public class HtmlTreeBuilderState_values_76363456119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19495;

    public HtmlTreeBuilderState_values_76363456119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19818 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term19817 = ((Class) term19818).getDeclaredField((String) "Initial");
        ((Field) term19817).setAccessible(true);
        Object enum51 = ((Field) term19817).get((Object) null);
        Class<? extends Object> term20031 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20030 = ((Class) term20031).getDeclaredField((String) "BeforeHtml");
        ((Field) term20030).setAccessible(true);
        Object enum52 = ((Field) term20030).get((Object) null);
        Class<? extends Object> term20253 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20252 = ((Class) term20253).getDeclaredField((String) "BeforeHead");
        ((Field) term20252).setAccessible(true);
        Object enum53 = ((Field) term20252).get((Object) null);
        Class<? extends Object> term20475 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20474 = ((Class) term20475).getDeclaredField((String) "InHead");
        ((Field) term20474).setAccessible(true);
        Object enum54 = ((Field) term20474).get((Object) null);
        Class<? extends Object> term20685 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20684 = ((Class) term20685).getDeclaredField((String) "InHeadNoscript");
        ((Field) term20684).setAccessible(true);
        Object enum55 = ((Field) term20684).get((Object) null);
        Class<? extends Object> term20919 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20918 = ((Class) term20919).getDeclaredField((String) "AfterHead");
        ((Field) term20918).setAccessible(true);
        Object enum56 = ((Field) term20918).get((Object) null);
        Class<? extends Object> term21138 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21137 = ((Class) term21138).getDeclaredField((String) "InBody");
        ((Field) term21137).setAccessible(true);
        Object enum57 = ((Field) term21137).get((Object) null);
        Class<? extends Object> term21348 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21347 = ((Class) term21348).getDeclaredField((String) "Text");
        ((Field) term21347).setAccessible(true);
        Object enum58 = ((Field) term21347).get((Object) null);
        Class<? extends Object> term21552 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21551 = ((Class) term21552).getDeclaredField((String) "InTable");
        ((Field) term21551).setAccessible(true);
        Object enum59 = ((Field) term21551).get((Object) null);
        Class<? extends Object> term21765 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21764 = ((Class) term21765).getDeclaredField((String) "InTableText");
        ((Field) term21764).setAccessible(true);
        Object enum60 = ((Field) term21764).get((Object) null);
        Class<? extends Object> term21990 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21989 = ((Class) term21990).getDeclaredField((String) "InCaption");
        ((Field) term21989).setAccessible(true);
        Object enum61 = ((Field) term21989).get((Object) null);
        Class<? extends Object> term22209 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22208 = ((Class) term22209).getDeclaredField((String) "InColumnGroup");
        ((Field) term22208).setAccessible(true);
        Object enum62 = ((Field) term22208).get((Object) null);
        Class<? extends Object> term22443 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22442 = ((Class) term22443).getDeclaredField((String) "InTableBody");
        ((Field) term22442).setAccessible(true);
        Object enum63 = ((Field) term22442).get((Object) null);
        Class<? extends Object> term22668 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22667 = ((Class) term22668).getDeclaredField((String) "InRow");
        ((Field) term22667).setAccessible(true);
        Object enum64 = ((Field) term22667).get((Object) null);
        Class<? extends Object> term22875 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22874 = ((Class) term22875).getDeclaredField((String) "InCell");
        ((Field) term22874).setAccessible(true);
        Object enum65 = ((Field) term22874).get((Object) null);
        Class<? extends Object> term23085 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23084 = ((Class) term23085).getDeclaredField((String) "InSelect");
        ((Field) term23084).setAccessible(true);
        Object enum66 = ((Field) term23084).get((Object) null);
        Class<? extends Object> term23301 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23300 = ((Class) term23301).getDeclaredField((String) "InSelectInTable");
        ((Field) term23300).setAccessible(true);
        Object enum67 = ((Field) term23300).get((Object) null);
        Class<? extends Object> term23538 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23537 = ((Class) term23538).getDeclaredField((String) "AfterBody");
        ((Field) term23537).setAccessible(true);
        Object enum68 = ((Field) term23537).get((Object) null);
        Class<? extends Object> term23757 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23756 = ((Class) term23757).getDeclaredField((String) "InFrameset");
        ((Field) term23756).setAccessible(true);
        Object enum69 = ((Field) term23756).get((Object) null);
        Class<? extends Object> term23979 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23978 = ((Class) term23979).getDeclaredField((String) "AfterFrameset");
        ((Field) term23978).setAccessible(true);
        Object enum70 = ((Field) term23978).get((Object) null);
        Class<? extends Object> term24210 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24209 = ((Class) term24210).getDeclaredField((String) "AfterAfterBody");
        ((Field) term24209).setAccessible(true);
        Object enum71 = ((Field) term24209).get((Object) null);
        Class<? extends Object> term24444 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24443 = ((Class) term24444).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term24443).setAccessible(true);
        Object enum72 = ((Field) term24443).get((Object) null);
        Class<? extends Object> term24690 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24689 = ((Class) term24690).getDeclaredField((String) "ForeignContent");
        ((Field) term24689).setAccessible(true);
        Object enum73 = ((Field) term24689).get((Object) null);
        term19495 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term19495, 0, enum51);
        setElement(term19495, 1, enum52);
        setElement(term19495, 2, enum53);
        setElement(term19495, 3, enum54);
        setElement(term19495, 4, enum55);
        setElement(term19495, 5, enum56);
        setElement(term19495, 6, enum57);
        setElement(term19495, 7, enum58);
        setElement(term19495, 8, enum59);
        setElement(term19495, 9, enum60);
        setElement(term19495, 10, enum61);
        setElement(term19495, 11, enum62);
        setElement(term19495, 12, enum63);
        setElement(term19495, 13, enum64);
        setElement(term19495, 14, enum65);
        setElement(term19495, 15, enum66);
        setElement(term19495, 16, enum67);
        setElement(term19495, 17, enum68);
        setElement(term19495, 18, enum69);
        setElement(term19495, 19, enum70);
        setElement(term19495, 20, enum71);
        setElement(term19495, 21, enum72);
        setElement(term19495, 22, enum73);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term19495));
    }

};


