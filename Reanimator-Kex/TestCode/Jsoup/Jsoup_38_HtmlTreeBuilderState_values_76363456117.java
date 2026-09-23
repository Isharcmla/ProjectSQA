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

public class HtmlTreeBuilderState_values_76363456117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33161;

    public HtmlTreeBuilderState_values_76363456117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33484 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33483 = ((Class) term33484).getDeclaredField((String) "Initial");
        ((Field) term33483).setAccessible(true);
        Object enum89 = ((Field) term33483).get((Object) null);
        Class<? extends Object> term33697 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33696 = ((Class) term33697).getDeclaredField((String) "BeforeHtml");
        ((Field) term33696).setAccessible(true);
        Object enum90 = ((Field) term33696).get((Object) null);
        Class<? extends Object> term33919 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33918 = ((Class) term33919).getDeclaredField((String) "BeforeHead");
        ((Field) term33918).setAccessible(true);
        Object enum91 = ((Field) term33918).get((Object) null);
        Class<? extends Object> term34141 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34140 = ((Class) term34141).getDeclaredField((String) "InHead");
        ((Field) term34140).setAccessible(true);
        Object enum92 = ((Field) term34140).get((Object) null);
        Class<? extends Object> term34351 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34350 = ((Class) term34351).getDeclaredField((String) "InHeadNoscript");
        ((Field) term34350).setAccessible(true);
        Object enum93 = ((Field) term34350).get((Object) null);
        Class<? extends Object> term34585 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34584 = ((Class) term34585).getDeclaredField((String) "AfterHead");
        ((Field) term34584).setAccessible(true);
        Object enum94 = ((Field) term34584).get((Object) null);
        Class<? extends Object> term34804 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34803 = ((Class) term34804).getDeclaredField((String) "InBody");
        ((Field) term34803).setAccessible(true);
        Object enum95 = ((Field) term34803).get((Object) null);
        Class<? extends Object> term35014 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35013 = ((Class) term35014).getDeclaredField((String) "Text");
        ((Field) term35013).setAccessible(true);
        Object enum96 = ((Field) term35013).get((Object) null);
        Class<? extends Object> term35218 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35217 = ((Class) term35218).getDeclaredField((String) "InTable");
        ((Field) term35217).setAccessible(true);
        Object enum97 = ((Field) term35217).get((Object) null);
        Class<? extends Object> term35431 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35430 = ((Class) term35431).getDeclaredField((String) "InTableText");
        ((Field) term35430).setAccessible(true);
        Object enum98 = ((Field) term35430).get((Object) null);
        Class<? extends Object> term35656 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35655 = ((Class) term35656).getDeclaredField((String) "InCaption");
        ((Field) term35655).setAccessible(true);
        Object enum99 = ((Field) term35655).get((Object) null);
        Class<? extends Object> term35875 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35874 = ((Class) term35875).getDeclaredField((String) "InColumnGroup");
        ((Field) term35874).setAccessible(true);
        Object enum100 = ((Field) term35874).get((Object) null);
        Class<? extends Object> term36106 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36105 = ((Class) term36106).getDeclaredField((String) "InTableBody");
        ((Field) term36105).setAccessible(true);
        Object enum101 = ((Field) term36105).get((Object) null);
        Class<? extends Object> term36331 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36330 = ((Class) term36331).getDeclaredField((String) "InRow");
        ((Field) term36330).setAccessible(true);
        Object enum102 = ((Field) term36330).get((Object) null);
        Class<? extends Object> term36538 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36537 = ((Class) term36538).getDeclaredField((String) "InCell");
        ((Field) term36537).setAccessible(true);
        Object enum103 = ((Field) term36537).get((Object) null);
        Class<? extends Object> term36748 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36747 = ((Class) term36748).getDeclaredField((String) "InSelect");
        ((Field) term36747).setAccessible(true);
        Object enum104 = ((Field) term36747).get((Object) null);
        Class<? extends Object> term36964 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36963 = ((Class) term36964).getDeclaredField((String) "InSelectInTable");
        ((Field) term36963).setAccessible(true);
        Object enum105 = ((Field) term36963).get((Object) null);
        Class<? extends Object> term37201 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37200 = ((Class) term37201).getDeclaredField((String) "AfterBody");
        ((Field) term37200).setAccessible(true);
        Object enum106 = ((Field) term37200).get((Object) null);
        Class<? extends Object> term37420 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37419 = ((Class) term37420).getDeclaredField((String) "InFrameset");
        ((Field) term37419).setAccessible(true);
        Object enum107 = ((Field) term37419).get((Object) null);
        Class<? extends Object> term37642 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37641 = ((Class) term37642).getDeclaredField((String) "AfterFrameset");
        ((Field) term37641).setAccessible(true);
        Object enum108 = ((Field) term37641).get((Object) null);
        Class<? extends Object> term37873 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term37872 = ((Class) term37873).getDeclaredField((String) "AfterAfterBody");
        ((Field) term37872).setAccessible(true);
        Object enum109 = ((Field) term37872).get((Object) null);
        Class<? extends Object> term38107 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38106 = ((Class) term38107).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term38106).setAccessible(true);
        Object enum110 = ((Field) term38106).get((Object) null);
        Class<? extends Object> term38353 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term38352 = ((Class) term38353).getDeclaredField((String) "ForeignContent");
        ((Field) term38352).setAccessible(true);
        Object enum111 = ((Field) term38352).get((Object) null);
        term33161 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term33161, 0, enum89);
        setElement(term33161, 1, enum90);
        setElement(term33161, 2, enum91);
        setElement(term33161, 3, enum92);
        setElement(term33161, 4, enum93);
        setElement(term33161, 5, enum94);
        setElement(term33161, 6, enum95);
        setElement(term33161, 7, enum96);
        setElement(term33161, 8, enum97);
        setElement(term33161, 9, enum98);
        setElement(term33161, 10, enum99);
        setElement(term33161, 11, enum100);
        setElement(term33161, 12, enum101);
        setElement(term33161, 13, enum102);
        setElement(term33161, 14, enum103);
        setElement(term33161, 15, enum104);
        setElement(term33161, 16, enum105);
        setElement(term33161, 17, enum106);
        setElement(term33161, 18, enum107);
        setElement(term33161, 19, enum108);
        setElement(term33161, 20, enum109);
        setElement(term33161, 21, enum110);
        setElement(term33161, 22, enum111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term33161));
    }

};


