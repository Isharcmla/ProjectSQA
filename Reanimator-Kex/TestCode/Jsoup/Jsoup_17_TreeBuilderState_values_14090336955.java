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

public class TreeBuilderState_values_14090336955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13950;

    public TreeBuilderState_values_14090336955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14273 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term14272 = ((Class) term14273).getDeclaredField((String) "Initial");
        ((Field) term14272).setAccessible(true);
        Object enum16 = ((Field) term14272).get((Object) null);
        Class<? extends Object> term14466 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term14465 = ((Class) term14466).getDeclaredField((String) "BeforeHtml");
        ((Field) term14465).setAccessible(true);
        Object enum17 = ((Field) term14465).get((Object) null);
        Class<? extends Object> term14668 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term14667 = ((Class) term14668).getDeclaredField((String) "BeforeHead");
        ((Field) term14667).setAccessible(true);
        Object enum18 = ((Field) term14667).get((Object) null);
        Class<? extends Object> term14870 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term14869 = ((Class) term14870).getDeclaredField((String) "InHead");
        ((Field) term14869).setAccessible(true);
        Object enum19 = ((Field) term14869).get((Object) null);
        Class<? extends Object> term15060 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term15059 = ((Class) term15060).getDeclaredField((String) "InHeadNoscript");
        ((Field) term15059).setAccessible(true);
        Object enum20 = ((Field) term15059).get((Object) null);
        Class<? extends Object> term15274 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term15273 = ((Class) term15274).getDeclaredField((String) "AfterHead");
        ((Field) term15273).setAccessible(true);
        Object enum21 = ((Field) term15273).get((Object) null);
        Class<? extends Object> term15473 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term15472 = ((Class) term15473).getDeclaredField((String) "InBody");
        ((Field) term15472).setAccessible(true);
        Object enum22 = ((Field) term15472).get((Object) null);
        Class<? extends Object> term15663 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term15662 = ((Class) term15663).getDeclaredField((String) "Text");
        ((Field) term15662).setAccessible(true);
        Object enum23 = ((Field) term15662).get((Object) null);
        Class<? extends Object> term15847 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term15846 = ((Class) term15847).getDeclaredField((String) "InTable");
        ((Field) term15846).setAccessible(true);
        Object enum24 = ((Field) term15846).get((Object) null);
        Class<? extends Object> term16040 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term16039 = ((Class) term16040).getDeclaredField((String) "InTableText");
        ((Field) term16039).setAccessible(true);
        Object enum25 = ((Field) term16039).get((Object) null);
        Class<? extends Object> term16245 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term16244 = ((Class) term16245).getDeclaredField((String) "InCaption");
        ((Field) term16244).setAccessible(true);
        Object enum26 = ((Field) term16244).get((Object) null);
        Class<? extends Object> term16444 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term16443 = ((Class) term16444).getDeclaredField((String) "InColumnGroup");
        ((Field) term16443).setAccessible(true);
        Object enum27 = ((Field) term16443).get((Object) null);
        Class<? extends Object> term16655 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term16654 = ((Class) term16655).getDeclaredField((String) "InTableBody");
        ((Field) term16654).setAccessible(true);
        Object enum28 = ((Field) term16654).get((Object) null);
        Class<? extends Object> term16860 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term16859 = ((Class) term16860).getDeclaredField((String) "InRow");
        ((Field) term16859).setAccessible(true);
        Object enum29 = ((Field) term16859).get((Object) null);
        Class<? extends Object> term17047 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term17046 = ((Class) term17047).getDeclaredField((String) "InCell");
        ((Field) term17046).setAccessible(true);
        Object enum30 = ((Field) term17046).get((Object) null);
        Class<? extends Object> term17237 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term17236 = ((Class) term17237).getDeclaredField((String) "InSelect");
        ((Field) term17236).setAccessible(true);
        Object enum31 = ((Field) term17236).get((Object) null);
        Class<? extends Object> term17433 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term17432 = ((Class) term17433).getDeclaredField((String) "InSelectInTable");
        ((Field) term17432).setAccessible(true);
        Object enum32 = ((Field) term17432).get((Object) null);
        Class<? extends Object> term17650 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term17649 = ((Class) term17650).getDeclaredField((String) "AfterBody");
        ((Field) term17649).setAccessible(true);
        Object enum33 = ((Field) term17649).get((Object) null);
        Class<? extends Object> term17849 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term17848 = ((Class) term17849).getDeclaredField((String) "InFrameset");
        ((Field) term17848).setAccessible(true);
        Object enum34 = ((Field) term17848).get((Object) null);
        Class<? extends Object> term18051 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term18050 = ((Class) term18051).getDeclaredField((String) "AfterFrameset");
        ((Field) term18050).setAccessible(true);
        Object enum35 = ((Field) term18050).get((Object) null);
        Class<? extends Object> term18262 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term18261 = ((Class) term18262).getDeclaredField((String) "AfterAfterBody");
        ((Field) term18261).setAccessible(true);
        Object enum36 = ((Field) term18261).get((Object) null);
        Class<? extends Object> term18476 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term18475 = ((Class) term18476).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term18475).setAccessible(true);
        Object enum37 = ((Field) term18475).get((Object) null);
        Class<? extends Object> term18702 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term18701 = ((Class) term18702).getDeclaredField((String) "ForeignContent");
        ((Field) term18701).setAccessible(true);
        Object enum38 = ((Field) term18701).get((Object) null);
        term13950 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term13950, 0, enum16);
        setElement(term13950, 1, enum17);
        setElement(term13950, 2, enum18);
        setElement(term13950, 3, enum19);
        setElement(term13950, 4, enum20);
        setElement(term13950, 5, enum21);
        setElement(term13950, 6, enum22);
        setElement(term13950, 7, enum23);
        setElement(term13950, 8, enum24);
        setElement(term13950, 9, enum25);
        setElement(term13950, 10, enum26);
        setElement(term13950, 11, enum27);
        setElement(term13950, 12, enum28);
        setElement(term13950, 13, enum29);
        setElement(term13950, 14, enum30);
        setElement(term13950, 15, enum31);
        setElement(term13950, 16, enum32);
        setElement(term13950, 17, enum33);
        setElement(term13950, 18, enum34);
        setElement(term13950, 19, enum35);
        setElement(term13950, 20, enum36);
        setElement(term13950, 21, enum37);
        setElement(term13950, 22, enum38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term13950));
    }

};


