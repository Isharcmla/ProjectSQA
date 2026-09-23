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

public class HtmlTreeBuilderState_values_76363456155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52504;

    public HtmlTreeBuilderState_values_76363456155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52827 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term52826 = ((Class) term52827).getDeclaredField((String) "Initial");
        ((Field) term52826).setAccessible(true);
        Object enum123 = ((Field) term52826).get((Object) null);
        Class<? extends Object> term53040 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53039 = ((Class) term53040).getDeclaredField((String) "BeforeHtml");
        ((Field) term53039).setAccessible(true);
        Object enum124 = ((Field) term53039).get((Object) null);
        Class<? extends Object> term53262 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53261 = ((Class) term53262).getDeclaredField((String) "BeforeHead");
        ((Field) term53261).setAccessible(true);
        Object enum125 = ((Field) term53261).get((Object) null);
        Class<? extends Object> term53484 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53483 = ((Class) term53484).getDeclaredField((String) "InHead");
        ((Field) term53483).setAccessible(true);
        Object enum126 = ((Field) term53483).get((Object) null);
        Class<? extends Object> term53694 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53693 = ((Class) term53694).getDeclaredField((String) "InHeadNoscript");
        ((Field) term53693).setAccessible(true);
        Object enum127 = ((Field) term53693).get((Object) null);
        Class<? extends Object> term53928 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term53927 = ((Class) term53928).getDeclaredField((String) "AfterHead");
        ((Field) term53927).setAccessible(true);
        Object enum128 = ((Field) term53927).get((Object) null);
        Class<? extends Object> term54147 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54146 = ((Class) term54147).getDeclaredField((String) "InBody");
        ((Field) term54146).setAccessible(true);
        Object enum129 = ((Field) term54146).get((Object) null);
        Class<? extends Object> term54357 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54356 = ((Class) term54357).getDeclaredField((String) "Text");
        ((Field) term54356).setAccessible(true);
        Object enum130 = ((Field) term54356).get((Object) null);
        Class<? extends Object> term54561 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54560 = ((Class) term54561).getDeclaredField((String) "InTable");
        ((Field) term54560).setAccessible(true);
        Object enum131 = ((Field) term54560).get((Object) null);
        Class<? extends Object> term54774 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54773 = ((Class) term54774).getDeclaredField((String) "InTableText");
        ((Field) term54773).setAccessible(true);
        Object enum132 = ((Field) term54773).get((Object) null);
        Class<? extends Object> term54999 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54998 = ((Class) term54999).getDeclaredField((String) "InCaption");
        ((Field) term54998).setAccessible(true);
        Object enum133 = ((Field) term54998).get((Object) null);
        Class<? extends Object> term55218 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55217 = ((Class) term55218).getDeclaredField((String) "InColumnGroup");
        ((Field) term55217).setAccessible(true);
        Object enum134 = ((Field) term55217).get((Object) null);
        Class<? extends Object> term55449 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55448 = ((Class) term55449).getDeclaredField((String) "InTableBody");
        ((Field) term55448).setAccessible(true);
        Object enum135 = ((Field) term55448).get((Object) null);
        Class<? extends Object> term55674 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55673 = ((Class) term55674).getDeclaredField((String) "InRow");
        ((Field) term55673).setAccessible(true);
        Object enum136 = ((Field) term55673).get((Object) null);
        Class<? extends Object> term55881 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55880 = ((Class) term55881).getDeclaredField((String) "InCell");
        ((Field) term55880).setAccessible(true);
        Object enum137 = ((Field) term55880).get((Object) null);
        Class<? extends Object> term56091 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56090 = ((Class) term56091).getDeclaredField((String) "InSelect");
        ((Field) term56090).setAccessible(true);
        Object enum138 = ((Field) term56090).get((Object) null);
        Class<? extends Object> term56307 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56306 = ((Class) term56307).getDeclaredField((String) "InSelectInTable");
        ((Field) term56306).setAccessible(true);
        Object enum139 = ((Field) term56306).get((Object) null);
        Class<? extends Object> term56544 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56543 = ((Class) term56544).getDeclaredField((String) "AfterBody");
        ((Field) term56543).setAccessible(true);
        Object enum140 = ((Field) term56543).get((Object) null);
        Class<? extends Object> term56763 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56762 = ((Class) term56763).getDeclaredField((String) "InFrameset");
        ((Field) term56762).setAccessible(true);
        Object enum141 = ((Field) term56762).get((Object) null);
        Class<? extends Object> term56986 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56985 = ((Class) term56986).getDeclaredField((String) "AfterFrameset");
        ((Field) term56985).setAccessible(true);
        Object enum142 = ((Field) term56985).get((Object) null);
        Class<? extends Object> term57238 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57237 = ((Class) term57238).getDeclaredField((String) "AfterAfterBody");
        ((Field) term57237).setAccessible(true);
        Object enum143 = ((Field) term57237).get((Object) null);
        Class<? extends Object> term57630 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57629 = ((Class) term57630).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term57629).setAccessible(true);
        Object enum144 = ((Field) term57629).get((Object) null);
        Class<? extends Object> term57876 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57875 = ((Class) term57876).getDeclaredField((String) "ForeignContent");
        ((Field) term57875).setAccessible(true);
        Object enum145 = ((Field) term57875).get((Object) null);
        term52504 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term52504, 0, enum123);
        setElement(term52504, 1, enum124);
        setElement(term52504, 2, enum125);
        setElement(term52504, 3, enum126);
        setElement(term52504, 4, enum127);
        setElement(term52504, 5, enum128);
        setElement(term52504, 6, enum129);
        setElement(term52504, 7, enum130);
        setElement(term52504, 8, enum131);
        setElement(term52504, 9, enum132);
        setElement(term52504, 10, enum133);
        setElement(term52504, 11, enum134);
        setElement(term52504, 12, enum135);
        setElement(term52504, 13, enum136);
        setElement(term52504, 14, enum137);
        setElement(term52504, 15, enum138);
        setElement(term52504, 16, enum139);
        setElement(term52504, 17, enum140);
        setElement(term52504, 18, enum141);
        setElement(term52504, 19, enum142);
        setElement(term52504, 20, enum143);
        setElement(term52504, 21, enum144);
        setElement(term52504, 22, enum145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term52504));
    }

};


