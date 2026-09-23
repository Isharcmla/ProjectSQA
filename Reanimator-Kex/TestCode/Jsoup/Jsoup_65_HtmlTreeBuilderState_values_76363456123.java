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
     Object term26037;

    public HtmlTreeBuilderState_values_76363456123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26360 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26359 = ((Class) term26360).getDeclaredField((String) "Initial");
        ((Field) term26359).setAccessible(true);
        Object enum74 = ((Field) term26359).get((Object) null);
        Class<? extends Object> term26573 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26572 = ((Class) term26573).getDeclaredField((String) "BeforeHtml");
        ((Field) term26572).setAccessible(true);
        Object enum75 = ((Field) term26572).get((Object) null);
        Class<? extends Object> term26795 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term26794 = ((Class) term26795).getDeclaredField((String) "BeforeHead");
        ((Field) term26794).setAccessible(true);
        Object enum76 = ((Field) term26794).get((Object) null);
        Class<? extends Object> term27017 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27016 = ((Class) term27017).getDeclaredField((String) "InHead");
        ((Field) term27016).setAccessible(true);
        Object enum77 = ((Field) term27016).get((Object) null);
        Class<? extends Object> term27227 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27226 = ((Class) term27227).getDeclaredField((String) "InHeadNoscript");
        ((Field) term27226).setAccessible(true);
        Object enum78 = ((Field) term27226).get((Object) null);
        Class<? extends Object> term27461 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27460 = ((Class) term27461).getDeclaredField((String) "AfterHead");
        ((Field) term27460).setAccessible(true);
        Object enum79 = ((Field) term27460).get((Object) null);
        Class<? extends Object> term27680 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27679 = ((Class) term27680).getDeclaredField((String) "InBody");
        ((Field) term27679).setAccessible(true);
        Object enum80 = ((Field) term27679).get((Object) null);
        Class<? extends Object> term27890 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term27889 = ((Class) term27890).getDeclaredField((String) "Text");
        ((Field) term27889).setAccessible(true);
        Object enum81 = ((Field) term27889).get((Object) null);
        Class<? extends Object> term28094 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28093 = ((Class) term28094).getDeclaredField((String) "InTable");
        ((Field) term28093).setAccessible(true);
        Object enum82 = ((Field) term28093).get((Object) null);
        Class<? extends Object> term28307 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28306 = ((Class) term28307).getDeclaredField((String) "InTableText");
        ((Field) term28306).setAccessible(true);
        Object enum83 = ((Field) term28306).get((Object) null);
        Class<? extends Object> term28532 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28531 = ((Class) term28532).getDeclaredField((String) "InCaption");
        ((Field) term28531).setAccessible(true);
        Object enum84 = ((Field) term28531).get((Object) null);
        Class<? extends Object> term28751 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28750 = ((Class) term28751).getDeclaredField((String) "InColumnGroup");
        ((Field) term28750).setAccessible(true);
        Object enum85 = ((Field) term28750).get((Object) null);
        Class<? extends Object> term28982 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term28981 = ((Class) term28982).getDeclaredField((String) "InTableBody");
        ((Field) term28981).setAccessible(true);
        Object enum86 = ((Field) term28981).get((Object) null);
        Class<? extends Object> term29207 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29206 = ((Class) term29207).getDeclaredField((String) "InRow");
        ((Field) term29206).setAccessible(true);
        Object enum87 = ((Field) term29206).get((Object) null);
        Class<? extends Object> term29414 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29413 = ((Class) term29414).getDeclaredField((String) "InCell");
        ((Field) term29413).setAccessible(true);
        Object enum88 = ((Field) term29413).get((Object) null);
        Class<? extends Object> term29624 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29623 = ((Class) term29624).getDeclaredField((String) "InSelect");
        ((Field) term29623).setAccessible(true);
        Object enum89 = ((Field) term29623).get((Object) null);
        Class<? extends Object> term29840 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term29839 = ((Class) term29840).getDeclaredField((String) "InSelectInTable");
        ((Field) term29839).setAccessible(true);
        Object enum90 = ((Field) term29839).get((Object) null);
        Class<? extends Object> term30078 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30077 = ((Class) term30078).getDeclaredField((String) "AfterBody");
        ((Field) term30077).setAccessible(true);
        Object enum91 = ((Field) term30077).get((Object) null);
        Class<? extends Object> term30298 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30297 = ((Class) term30298).getDeclaredField((String) "InFrameset");
        ((Field) term30297).setAccessible(true);
        Object enum92 = ((Field) term30297).get((Object) null);
        Class<? extends Object> term30521 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30520 = ((Class) term30521).getDeclaredField((String) "AfterFrameset");
        ((Field) term30520).setAccessible(true);
        Object enum93 = ((Field) term30520).get((Object) null);
        Class<? extends Object> term30752 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30751 = ((Class) term30752).getDeclaredField((String) "AfterAfterBody");
        ((Field) term30751).setAccessible(true);
        Object enum94 = ((Field) term30751).get((Object) null);
        Class<? extends Object> term30986 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30985 = ((Class) term30986).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term30985).setAccessible(true);
        Object enum95 = ((Field) term30985).get((Object) null);
        Class<? extends Object> term31232 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term31231 = ((Class) term31232).getDeclaredField((String) "ForeignContent");
        ((Field) term31231).setAccessible(true);
        Object enum96 = ((Field) term31231).get((Object) null);
        term26037 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term26037, 0, enum74);
        setElement(term26037, 1, enum75);
        setElement(term26037, 2, enum76);
        setElement(term26037, 3, enum77);
        setElement(term26037, 4, enum78);
        setElement(term26037, 5, enum79);
        setElement(term26037, 6, enum80);
        setElement(term26037, 7, enum81);
        setElement(term26037, 8, enum82);
        setElement(term26037, 9, enum83);
        setElement(term26037, 10, enum84);
        setElement(term26037, 11, enum85);
        setElement(term26037, 12, enum86);
        setElement(term26037, 13, enum87);
        setElement(term26037, 14, enum88);
        setElement(term26037, 15, enum89);
        setElement(term26037, 16, enum90);
        setElement(term26037, 17, enum91);
        setElement(term26037, 18, enum92);
        setElement(term26037, 19, enum93);
        setElement(term26037, 20, enum94);
        setElement(term26037, 21, enum95);
        setElement(term26037, 22, enum96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term26037));
    }

};


