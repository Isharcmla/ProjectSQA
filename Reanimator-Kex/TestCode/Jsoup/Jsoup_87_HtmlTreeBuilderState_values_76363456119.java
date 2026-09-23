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
     Object term24422;

    public HtmlTreeBuilderState_values_76363456119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24745 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24744 = ((Class) term24745).getDeclaredField((String) "Initial");
        ((Field) term24744).setAccessible(true);
        Object enum51 = ((Field) term24744).get((Object) null);
        Class<? extends Object> term24958 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24957 = ((Class) term24958).getDeclaredField((String) "BeforeHtml");
        ((Field) term24957).setAccessible(true);
        Object enum52 = ((Field) term24957).get((Object) null);
        Class<? extends Object> term25180 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25179 = ((Class) term25180).getDeclaredField((String) "BeforeHead");
        ((Field) term25179).setAccessible(true);
        Object enum53 = ((Field) term25179).get((Object) null);
        Class<? extends Object> term25402 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25401 = ((Class) term25402).getDeclaredField((String) "InHead");
        ((Field) term25401).setAccessible(true);
        Object enum54 = ((Field) term25401).get((Object) null);
        Class<? extends Object> term25612 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25611 = ((Class) term25612).getDeclaredField((String) "InHeadNoscript");
        ((Field) term25611).setAccessible(true);
        Object enum55 = ((Field) term25611).get((Object) null);
        Class<? extends Object> term25846 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25845 = ((Class) term25846).getDeclaredField((String) "AfterHead");
        ((Field) term25845).setAccessible(true);
        Object enum56 = ((Field) term25845).get((Object) null);
        Class<? extends Object> term26065 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26064 = ((Class) term26065).getDeclaredField((String) "InBody");
        ((Field) term26064).setAccessible(true);
        Object enum57 = ((Field) term26064).get((Object) null);
        Class<? extends Object> term26275 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26274 = ((Class) term26275).getDeclaredField((String) "Text");
        ((Field) term26274).setAccessible(true);
        Object enum58 = ((Field) term26274).get((Object) null);
        Class<? extends Object> term26479 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26478 = ((Class) term26479).getDeclaredField((String) "InTable");
        ((Field) term26478).setAccessible(true);
        Object enum59 = ((Field) term26478).get((Object) null);
        Class<? extends Object> term26692 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26691 = ((Class) term26692).getDeclaredField((String) "InTableText");
        ((Field) term26691).setAccessible(true);
        Object enum60 = ((Field) term26691).get((Object) null);
        Class<? extends Object> term26917 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26916 = ((Class) term26917).getDeclaredField((String) "InCaption");
        ((Field) term26916).setAccessible(true);
        Object enum61 = ((Field) term26916).get((Object) null);
        Class<? extends Object> term27136 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27135 = ((Class) term27136).getDeclaredField((String) "InColumnGroup");
        ((Field) term27135).setAccessible(true);
        Object enum62 = ((Field) term27135).get((Object) null);
        Class<? extends Object> term27367 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27366 = ((Class) term27367).getDeclaredField((String) "InTableBody");
        ((Field) term27366).setAccessible(true);
        Object enum63 = ((Field) term27366).get((Object) null);
        Class<? extends Object> term27592 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27591 = ((Class) term27592).getDeclaredField((String) "InRow");
        ((Field) term27591).setAccessible(true);
        Object enum64 = ((Field) term27591).get((Object) null);
        Class<? extends Object> term27799 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27798 = ((Class) term27799).getDeclaredField((String) "InCell");
        ((Field) term27798).setAccessible(true);
        Object enum65 = ((Field) term27798).get((Object) null);
        Class<? extends Object> term28009 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28008 = ((Class) term28009).getDeclaredField((String) "InSelect");
        ((Field) term28008).setAccessible(true);
        Object enum66 = ((Field) term28008).get((Object) null);
        Class<? extends Object> term28225 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28224 = ((Class) term28225).getDeclaredField((String) "InSelectInTable");
        ((Field) term28224).setAccessible(true);
        Object enum67 = ((Field) term28224).get((Object) null);
        Class<? extends Object> term28462 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28461 = ((Class) term28462).getDeclaredField((String) "AfterBody");
        ((Field) term28461).setAccessible(true);
        Object enum68 = ((Field) term28461).get((Object) null);
        Class<? extends Object> term28681 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28680 = ((Class) term28681).getDeclaredField((String) "InFrameset");
        ((Field) term28680).setAccessible(true);
        Object enum69 = ((Field) term28680).get((Object) null);
        Class<? extends Object> term28903 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28902 = ((Class) term28903).getDeclaredField((String) "AfterFrameset");
        ((Field) term28902).setAccessible(true);
        Object enum70 = ((Field) term28902).get((Object) null);
        Class<? extends Object> term29134 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29133 = ((Class) term29134).getDeclaredField((String) "AfterAfterBody");
        ((Field) term29133).setAccessible(true);
        Object enum71 = ((Field) term29133).get((Object) null);
        Class<? extends Object> term29368 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29367 = ((Class) term29368).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term29367).setAccessible(true);
        Object enum72 = ((Field) term29367).get((Object) null);
        Class<? extends Object> term29614 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29613 = ((Class) term29614).getDeclaredField((String) "ForeignContent");
        ((Field) term29613).setAccessible(true);
        Object enum73 = ((Field) term29613).get((Object) null);
        term24422 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term24422, 0, enum51);
        setElement(term24422, 1, enum52);
        setElement(term24422, 2, enum53);
        setElement(term24422, 3, enum54);
        setElement(term24422, 4, enum55);
        setElement(term24422, 5, enum56);
        setElement(term24422, 6, enum57);
        setElement(term24422, 7, enum58);
        setElement(term24422, 8, enum59);
        setElement(term24422, 9, enum60);
        setElement(term24422, 10, enum61);
        setElement(term24422, 11, enum62);
        setElement(term24422, 12, enum63);
        setElement(term24422, 13, enum64);
        setElement(term24422, 14, enum65);
        setElement(term24422, 15, enum66);
        setElement(term24422, 16, enum67);
        setElement(term24422, 17, enum68);
        setElement(term24422, 18, enum69);
        setElement(term24422, 19, enum70);
        setElement(term24422, 20, enum71);
        setElement(term24422, 21, enum72);
        setElement(term24422, 22, enum73);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term24422));
    }

};


