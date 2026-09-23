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

public class TreeBuilderState_values_140903369523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41763;

    public TreeBuilderState_values_140903369523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42086 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term42085 = ((Class) term42086).getDeclaredField((String) "Initial");
        ((Field) term42085).setAccessible(true);
        Object enum118 = ((Field) term42085).get((Object) null);
        Class<? extends Object> term42279 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term42278 = ((Class) term42279).getDeclaredField((String) "BeforeHtml");
        ((Field) term42278).setAccessible(true);
        Object enum119 = ((Field) term42278).get((Object) null);
        Class<? extends Object> term42481 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term42480 = ((Class) term42481).getDeclaredField((String) "BeforeHead");
        ((Field) term42480).setAccessible(true);
        Object enum120 = ((Field) term42480).get((Object) null);
        Class<? extends Object> term42683 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term42682 = ((Class) term42683).getDeclaredField((String) "InHead");
        ((Field) term42682).setAccessible(true);
        Object enum121 = ((Field) term42682).get((Object) null);
        Class<? extends Object> term42873 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term42872 = ((Class) term42873).getDeclaredField((String) "InHeadNoscript");
        ((Field) term42872).setAccessible(true);
        Object enum122 = ((Field) term42872).get((Object) null);
        Class<? extends Object> term43087 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term43086 = ((Class) term43087).getDeclaredField((String) "AfterHead");
        ((Field) term43086).setAccessible(true);
        Object enum123 = ((Field) term43086).get((Object) null);
        Class<? extends Object> term43286 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term43285 = ((Class) term43286).getDeclaredField((String) "InBody");
        ((Field) term43285).setAccessible(true);
        Object enum124 = ((Field) term43285).get((Object) null);
        Class<? extends Object> term43476 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term43475 = ((Class) term43476).getDeclaredField((String) "Text");
        ((Field) term43475).setAccessible(true);
        Object enum125 = ((Field) term43475).get((Object) null);
        Class<? extends Object> term43660 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term43659 = ((Class) term43660).getDeclaredField((String) "InTable");
        ((Field) term43659).setAccessible(true);
        Object enum126 = ((Field) term43659).get((Object) null);
        Class<? extends Object> term43853 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term43852 = ((Class) term43853).getDeclaredField((String) "InTableText");
        ((Field) term43852).setAccessible(true);
        Object enum127 = ((Field) term43852).get((Object) null);
        Class<? extends Object> term44058 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term44057 = ((Class) term44058).getDeclaredField((String) "InCaption");
        ((Field) term44057).setAccessible(true);
        Object enum128 = ((Field) term44057).get((Object) null);
        Class<? extends Object> term44257 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term44256 = ((Class) term44257).getDeclaredField((String) "InColumnGroup");
        ((Field) term44256).setAccessible(true);
        Object enum129 = ((Field) term44256).get((Object) null);
        Class<? extends Object> term44468 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term44467 = ((Class) term44468).getDeclaredField((String) "InTableBody");
        ((Field) term44467).setAccessible(true);
        Object enum130 = ((Field) term44467).get((Object) null);
        Class<? extends Object> term44673 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term44672 = ((Class) term44673).getDeclaredField((String) "InRow");
        ((Field) term44672).setAccessible(true);
        Object enum131 = ((Field) term44672).get((Object) null);
        Class<? extends Object> term44860 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term44859 = ((Class) term44860).getDeclaredField((String) "InCell");
        ((Field) term44859).setAccessible(true);
        Object enum132 = ((Field) term44859).get((Object) null);
        Class<? extends Object> term45050 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term45049 = ((Class) term45050).getDeclaredField((String) "InSelect");
        ((Field) term45049).setAccessible(true);
        Object enum133 = ((Field) term45049).get((Object) null);
        Class<? extends Object> term45246 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term45245 = ((Class) term45246).getDeclaredField((String) "InSelectInTable");
        ((Field) term45245).setAccessible(true);
        Object enum134 = ((Field) term45245).get((Object) null);
        Class<? extends Object> term45463 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term45462 = ((Class) term45463).getDeclaredField((String) "AfterBody");
        ((Field) term45462).setAccessible(true);
        Object enum135 = ((Field) term45462).get((Object) null);
        Class<? extends Object> term45662 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term45661 = ((Class) term45662).getDeclaredField((String) "InFrameset");
        ((Field) term45661).setAccessible(true);
        Object enum136 = ((Field) term45661).get((Object) null);
        Class<? extends Object> term45864 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term45863 = ((Class) term45864).getDeclaredField((String) "AfterFrameset");
        ((Field) term45863).setAccessible(true);
        Object enum137 = ((Field) term45863).get((Object) null);
        Class<? extends Object> term46075 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term46074 = ((Class) term46075).getDeclaredField((String) "AfterAfterBody");
        ((Field) term46074).setAccessible(true);
        Object enum138 = ((Field) term46074).get((Object) null);
        Class<? extends Object> term46289 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term46288 = ((Class) term46289).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term46288).setAccessible(true);
        Object enum139 = ((Field) term46288).get((Object) null);
        Class<? extends Object> term46515 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term46514 = ((Class) term46515).getDeclaredField((String) "ForeignContent");
        ((Field) term46514).setAccessible(true);
        Object enum140 = ((Field) term46514).get((Object) null);
        term41763 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term41763, 0, enum118);
        setElement(term41763, 1, enum119);
        setElement(term41763, 2, enum120);
        setElement(term41763, 3, enum121);
        setElement(term41763, 4, enum122);
        setElement(term41763, 5, enum123);
        setElement(term41763, 6, enum124);
        setElement(term41763, 7, enum125);
        setElement(term41763, 8, enum126);
        setElement(term41763, 9, enum127);
        setElement(term41763, 10, enum128);
        setElement(term41763, 11, enum129);
        setElement(term41763, 12, enum130);
        setElement(term41763, 13, enum131);
        setElement(term41763, 14, enum132);
        setElement(term41763, 15, enum133);
        setElement(term41763, 16, enum134);
        setElement(term41763, 17, enum135);
        setElement(term41763, 18, enum136);
        setElement(term41763, 19, enum137);
        setElement(term41763, 20, enum138);
        setElement(term41763, 21, enum139);
        setElement(term41763, 22, enum140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term41763));
    }

};


