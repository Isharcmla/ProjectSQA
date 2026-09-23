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

public class HtmlTreeBuilderState_values_76363456141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31234;

    public HtmlTreeBuilderState_values_76363456141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31557 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31556 = ((Class) term31557).getDeclaredField((String) "Initial");
        ((Field) term31556).setAccessible(true);
        Object enum87 = ((Field) term31556).get((Object) null);
        Class<? extends Object> term31770 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31769 = ((Class) term31770).getDeclaredField((String) "BeforeHtml");
        ((Field) term31769).setAccessible(true);
        Object enum88 = ((Field) term31769).get((Object) null);
        Class<? extends Object> term31992 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31991 = ((Class) term31992).getDeclaredField((String) "BeforeHead");
        ((Field) term31991).setAccessible(true);
        Object enum89 = ((Field) term31991).get((Object) null);
        Class<? extends Object> term32214 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32213 = ((Class) term32214).getDeclaredField((String) "InHead");
        ((Field) term32213).setAccessible(true);
        Object enum90 = ((Field) term32213).get((Object) null);
        Class<? extends Object> term32424 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32423 = ((Class) term32424).getDeclaredField((String) "InHeadNoscript");
        ((Field) term32423).setAccessible(true);
        Object enum91 = ((Field) term32423).get((Object) null);
        Class<? extends Object> term32658 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32657 = ((Class) term32658).getDeclaredField((String) "AfterHead");
        ((Field) term32657).setAccessible(true);
        Object enum92 = ((Field) term32657).get((Object) null);
        Class<? extends Object> term32877 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term32876 = ((Class) term32877).getDeclaredField((String) "InBody");
        ((Field) term32876).setAccessible(true);
        Object enum93 = ((Field) term32876).get((Object) null);
        Class<? extends Object> term33087 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33086 = ((Class) term33087).getDeclaredField((String) "Text");
        ((Field) term33086).setAccessible(true);
        Object enum94 = ((Field) term33086).get((Object) null);
        Class<? extends Object> term33291 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33290 = ((Class) term33291).getDeclaredField((String) "InTable");
        ((Field) term33290).setAccessible(true);
        Object enum95 = ((Field) term33290).get((Object) null);
        Class<? extends Object> term33520 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33519 = ((Class) term33520).getDeclaredField((String) "InTableText");
        ((Field) term33519).setAccessible(true);
        Object enum96 = ((Field) term33519).get((Object) null);
        Class<? extends Object> term33770 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33769 = ((Class) term33770).getDeclaredField((String) "InCaption");
        ((Field) term33769).setAccessible(true);
        Object enum97 = ((Field) term33769).get((Object) null);
        Class<? extends Object> term33989 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term33988 = ((Class) term33989).getDeclaredField((String) "InColumnGroup");
        ((Field) term33988).setAccessible(true);
        Object enum98 = ((Field) term33988).get((Object) null);
        Class<? extends Object> term34220 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34219 = ((Class) term34220).getDeclaredField((String) "InTableBody");
        ((Field) term34219).setAccessible(true);
        Object enum99 = ((Field) term34219).get((Object) null);
        Class<? extends Object> term34445 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34444 = ((Class) term34445).getDeclaredField((String) "InRow");
        ((Field) term34444).setAccessible(true);
        Object enum100 = ((Field) term34444).get((Object) null);
        Class<? extends Object> term34652 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34651 = ((Class) term34652).getDeclaredField((String) "InCell");
        ((Field) term34651).setAccessible(true);
        Object enum101 = ((Field) term34651).get((Object) null);
        Class<? extends Object> term34862 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34861 = ((Class) term34862).getDeclaredField((String) "InSelect");
        ((Field) term34861).setAccessible(true);
        Object enum102 = ((Field) term34861).get((Object) null);
        Class<? extends Object> term35078 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35077 = ((Class) term35078).getDeclaredField((String) "InSelectInTable");
        ((Field) term35077).setAccessible(true);
        Object enum103 = ((Field) term35077).get((Object) null);
        Class<? extends Object> term35315 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35314 = ((Class) term35315).getDeclaredField((String) "AfterBody");
        ((Field) term35314).setAccessible(true);
        Object enum104 = ((Field) term35314).get((Object) null);
        Class<? extends Object> term35534 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35533 = ((Class) term35534).getDeclaredField((String) "InFrameset");
        ((Field) term35533).setAccessible(true);
        Object enum105 = ((Field) term35533).get((Object) null);
        Class<? extends Object> term35756 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35755 = ((Class) term35756).getDeclaredField((String) "AfterFrameset");
        ((Field) term35755).setAccessible(true);
        Object enum106 = ((Field) term35755).get((Object) null);
        Class<? extends Object> term35987 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35986 = ((Class) term35987).getDeclaredField((String) "AfterAfterBody");
        ((Field) term35986).setAccessible(true);
        Object enum107 = ((Field) term35986).get((Object) null);
        Class<? extends Object> term36221 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36220 = ((Class) term36221).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term36220).setAccessible(true);
        Object enum108 = ((Field) term36220).get((Object) null);
        Class<? extends Object> term36467 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36466 = ((Class) term36467).getDeclaredField((String) "ForeignContent");
        ((Field) term36466).setAccessible(true);
        Object enum109 = ((Field) term36466).get((Object) null);
        term31234 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term31234, 0, enum87);
        setElement(term31234, 1, enum88);
        setElement(term31234, 2, enum89);
        setElement(term31234, 3, enum90);
        setElement(term31234, 4, enum91);
        setElement(term31234, 5, enum92);
        setElement(term31234, 6, enum93);
        setElement(term31234, 7, enum94);
        setElement(term31234, 8, enum95);
        setElement(term31234, 9, enum96);
        setElement(term31234, 10, enum97);
        setElement(term31234, 11, enum98);
        setElement(term31234, 12, enum99);
        setElement(term31234, 13, enum100);
        setElement(term31234, 14, enum101);
        setElement(term31234, 15, enum102);
        setElement(term31234, 16, enum103);
        setElement(term31234, 17, enum104);
        setElement(term31234, 18, enum105);
        setElement(term31234, 19, enum106);
        setElement(term31234, 20, enum107);
        setElement(term31234, 21, enum108);
        setElement(term31234, 22, enum109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term31234));
    }

};


