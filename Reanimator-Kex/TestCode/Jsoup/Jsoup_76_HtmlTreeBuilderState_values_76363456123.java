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

public class HtmlTreeBuilderState_values_76363456123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20663;

    public HtmlTreeBuilderState_values_76363456123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20986 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term20985 = ((Class) term20986).getDeclaredField((String) "Initial");
        ((Field) term20985).setAccessible(true);
        Object enum51 = ((Field) term20985).get((Object) null);
        Class<? extends Object> term21199 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21198 = ((Class) term21199).getDeclaredField((String) "BeforeHtml");
        ((Field) term21198).setAccessible(true);
        Object enum52 = ((Field) term21198).get((Object) null);
        Class<? extends Object> term21421 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21420 = ((Class) term21421).getDeclaredField((String) "BeforeHead");
        ((Field) term21420).setAccessible(true);
        Object enum53 = ((Field) term21420).get((Object) null);
        Class<? extends Object> term21643 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21642 = ((Class) term21643).getDeclaredField((String) "InHead");
        ((Field) term21642).setAccessible(true);
        Object enum54 = ((Field) term21642).get((Object) null);
        Class<? extends Object> term21853 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term21852 = ((Class) term21853).getDeclaredField((String) "InHeadNoscript");
        ((Field) term21852).setAccessible(true);
        Object enum55 = ((Field) term21852).get((Object) null);
        Class<? extends Object> term22087 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22086 = ((Class) term22087).getDeclaredField((String) "AfterHead");
        ((Field) term22086).setAccessible(true);
        Object enum56 = ((Field) term22086).get((Object) null);
        Class<? extends Object> term22306 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22305 = ((Class) term22306).getDeclaredField((String) "InBody");
        ((Field) term22305).setAccessible(true);
        Object enum57 = ((Field) term22305).get((Object) null);
        Class<? extends Object> term22516 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22515 = ((Class) term22516).getDeclaredField((String) "Text");
        ((Field) term22515).setAccessible(true);
        Object enum58 = ((Field) term22515).get((Object) null);
        Class<? extends Object> term22720 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22719 = ((Class) term22720).getDeclaredField((String) "InTable");
        ((Field) term22719).setAccessible(true);
        Object enum59 = ((Field) term22719).get((Object) null);
        Class<? extends Object> term22933 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term22932 = ((Class) term22933).getDeclaredField((String) "InTableText");
        ((Field) term22932).setAccessible(true);
        Object enum60 = ((Field) term22932).get((Object) null);
        Class<? extends Object> term23158 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23157 = ((Class) term23158).getDeclaredField((String) "InCaption");
        ((Field) term23157).setAccessible(true);
        Object enum61 = ((Field) term23157).get((Object) null);
        Class<? extends Object> term23377 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23376 = ((Class) term23377).getDeclaredField((String) "InColumnGroup");
        ((Field) term23376).setAccessible(true);
        Object enum62 = ((Field) term23376).get((Object) null);
        Class<? extends Object> term23608 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23607 = ((Class) term23608).getDeclaredField((String) "InTableBody");
        ((Field) term23607).setAccessible(true);
        Object enum63 = ((Field) term23607).get((Object) null);
        Class<? extends Object> term23833 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term23832 = ((Class) term23833).getDeclaredField((String) "InRow");
        ((Field) term23832).setAccessible(true);
        Object enum64 = ((Field) term23832).get((Object) null);
        Class<? extends Object> term24040 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24039 = ((Class) term24040).getDeclaredField((String) "InCell");
        ((Field) term24039).setAccessible(true);
        Object enum65 = ((Field) term24039).get((Object) null);
        Class<? extends Object> term24250 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24249 = ((Class) term24250).getDeclaredField((String) "InSelect");
        ((Field) term24249).setAccessible(true);
        Object enum66 = ((Field) term24249).get((Object) null);
        Class<? extends Object> term24466 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24465 = ((Class) term24466).getDeclaredField((String) "InSelectInTable");
        ((Field) term24465).setAccessible(true);
        Object enum67 = ((Field) term24465).get((Object) null);
        Class<? extends Object> term24703 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24702 = ((Class) term24703).getDeclaredField((String) "AfterBody");
        ((Field) term24702).setAccessible(true);
        Object enum68 = ((Field) term24702).get((Object) null);
        Class<? extends Object> term24922 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term24921 = ((Class) term24922).getDeclaredField((String) "InFrameset");
        ((Field) term24921).setAccessible(true);
        Object enum69 = ((Field) term24921).get((Object) null);
        Class<? extends Object> term25144 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25143 = ((Class) term25144).getDeclaredField((String) "AfterFrameset");
        ((Field) term25143).setAccessible(true);
        Object enum70 = ((Field) term25143).get((Object) null);
        Class<? extends Object> term25375 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25374 = ((Class) term25375).getDeclaredField((String) "AfterAfterBody");
        ((Field) term25374).setAccessible(true);
        Object enum71 = ((Field) term25374).get((Object) null);
        Class<? extends Object> term25609 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25608 = ((Class) term25609).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term25608).setAccessible(true);
        Object enum72 = ((Field) term25608).get((Object) null);
        Class<? extends Object> term25855 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term25854 = ((Class) term25855).getDeclaredField((String) "ForeignContent");
        ((Field) term25854).setAccessible(true);
        Object enum73 = ((Field) term25854).get((Object) null);
        term20663 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term20663, 0, enum51);
        setElement(term20663, 1, enum52);
        setElement(term20663, 2, enum53);
        setElement(term20663, 3, enum54);
        setElement(term20663, 4, enum55);
        setElement(term20663, 5, enum56);
        setElement(term20663, 6, enum57);
        setElement(term20663, 7, enum58);
        setElement(term20663, 8, enum59);
        setElement(term20663, 9, enum60);
        setElement(term20663, 10, enum61);
        setElement(term20663, 11, enum62);
        setElement(term20663, 12, enum63);
        setElement(term20663, 13, enum64);
        setElement(term20663, 14, enum65);
        setElement(term20663, 15, enum66);
        setElement(term20663, 16, enum67);
        setElement(term20663, 17, enum68);
        setElement(term20663, 18, enum69);
        setElement(term20663, 19, enum70);
        setElement(term20663, 20, enum71);
        setElement(term20663, 21, enum72);
        setElement(term20663, 22, enum73);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term20663));
    }

};


