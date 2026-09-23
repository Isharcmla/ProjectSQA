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

public class HtmlTreeBuilderState_values_76363456143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54406;

    public HtmlTreeBuilderState_values_76363456143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54729 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54728 = ((Class) term54729).getDeclaredField((String) "Initial");
        ((Field) term54728).setAccessible(true);
        Object enum130 = ((Field) term54728).get((Object) null);
        Class<? extends Object> term54942 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54941 = ((Class) term54942).getDeclaredField((String) "BeforeHtml");
        ((Field) term54941).setAccessible(true);
        Object enum131 = ((Field) term54941).get((Object) null);
        Class<? extends Object> term55164 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55163 = ((Class) term55164).getDeclaredField((String) "BeforeHead");
        ((Field) term55163).setAccessible(true);
        Object enum132 = ((Field) term55163).get((Object) null);
        Class<? extends Object> term55386 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55385 = ((Class) term55386).getDeclaredField((String) "InHead");
        ((Field) term55385).setAccessible(true);
        Object enum133 = ((Field) term55385).get((Object) null);
        Class<? extends Object> term55596 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55595 = ((Class) term55596).getDeclaredField((String) "InHeadNoscript");
        ((Field) term55595).setAccessible(true);
        Object enum134 = ((Field) term55595).get((Object) null);
        Class<? extends Object> term55830 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55829 = ((Class) term55830).getDeclaredField((String) "AfterHead");
        ((Field) term55829).setAccessible(true);
        Object enum135 = ((Field) term55829).get((Object) null);
        Class<? extends Object> term56049 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56048 = ((Class) term56049).getDeclaredField((String) "InBody");
        ((Field) term56048).setAccessible(true);
        Object enum136 = ((Field) term56048).get((Object) null);
        Class<? extends Object> term56259 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56258 = ((Class) term56259).getDeclaredField((String) "Text");
        ((Field) term56258).setAccessible(true);
        Object enum137 = ((Field) term56258).get((Object) null);
        Class<? extends Object> term56463 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56462 = ((Class) term56463).getDeclaredField((String) "InTable");
        ((Field) term56462).setAccessible(true);
        Object enum138 = ((Field) term56462).get((Object) null);
        Class<? extends Object> term56676 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56675 = ((Class) term56676).getDeclaredField((String) "InTableText");
        ((Field) term56675).setAccessible(true);
        Object enum139 = ((Field) term56675).get((Object) null);
        Class<? extends Object> term56901 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56900 = ((Class) term56901).getDeclaredField((String) "InCaption");
        ((Field) term56900).setAccessible(true);
        Object enum140 = ((Field) term56900).get((Object) null);
        Class<? extends Object> term57120 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57119 = ((Class) term57120).getDeclaredField((String) "InColumnGroup");
        ((Field) term57119).setAccessible(true);
        Object enum141 = ((Field) term57119).get((Object) null);
        Class<? extends Object> term57351 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57350 = ((Class) term57351).getDeclaredField((String) "InTableBody");
        ((Field) term57350).setAccessible(true);
        Object enum142 = ((Field) term57350).get((Object) null);
        Class<? extends Object> term57576 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57575 = ((Class) term57576).getDeclaredField((String) "InRow");
        ((Field) term57575).setAccessible(true);
        Object enum143 = ((Field) term57575).get((Object) null);
        Class<? extends Object> term57783 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57782 = ((Class) term57783).getDeclaredField((String) "InCell");
        ((Field) term57782).setAccessible(true);
        Object enum144 = ((Field) term57782).get((Object) null);
        Class<? extends Object> term57993 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57992 = ((Class) term57993).getDeclaredField((String) "InSelect");
        ((Field) term57992).setAccessible(true);
        Object enum145 = ((Field) term57992).get((Object) null);
        Class<? extends Object> term58209 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58208 = ((Class) term58209).getDeclaredField((String) "InSelectInTable");
        ((Field) term58208).setAccessible(true);
        Object enum146 = ((Field) term58208).get((Object) null);
        Class<? extends Object> term58446 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58445 = ((Class) term58446).getDeclaredField((String) "AfterBody");
        ((Field) term58445).setAccessible(true);
        Object enum147 = ((Field) term58445).get((Object) null);
        Class<? extends Object> term58665 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58664 = ((Class) term58665).getDeclaredField((String) "InFrameset");
        ((Field) term58664).setAccessible(true);
        Object enum148 = ((Field) term58664).get((Object) null);
        Class<? extends Object> term58887 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58886 = ((Class) term58887).getDeclaredField((String) "AfterFrameset");
        ((Field) term58886).setAccessible(true);
        Object enum149 = ((Field) term58886).get((Object) null);
        Class<? extends Object> term59118 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59117 = ((Class) term59118).getDeclaredField((String) "AfterAfterBody");
        ((Field) term59117).setAccessible(true);
        Object enum150 = ((Field) term59117).get((Object) null);
        Class<? extends Object> term59352 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59351 = ((Class) term59352).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term59351).setAccessible(true);
        Object enum151 = ((Field) term59351).get((Object) null);
        Class<? extends Object> term59598 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59597 = ((Class) term59598).getDeclaredField((String) "ForeignContent");
        ((Field) term59597).setAccessible(true);
        Object enum152 = ((Field) term59597).get((Object) null);
        term54406 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term54406, 0, enum130);
        setElement(term54406, 1, enum131);
        setElement(term54406, 2, enum132);
        setElement(term54406, 3, enum133);
        setElement(term54406, 4, enum134);
        setElement(term54406, 5, enum135);
        setElement(term54406, 6, enum136);
        setElement(term54406, 7, enum137);
        setElement(term54406, 8, enum138);
        setElement(term54406, 9, enum139);
        setElement(term54406, 10, enum140);
        setElement(term54406, 11, enum141);
        setElement(term54406, 12, enum142);
        setElement(term54406, 13, enum143);
        setElement(term54406, 14, enum144);
        setElement(term54406, 15, enum145);
        setElement(term54406, 16, enum146);
        setElement(term54406, 17, enum147);
        setElement(term54406, 18, enum148);
        setElement(term54406, 19, enum149);
        setElement(term54406, 20, enum150);
        setElement(term54406, 21, enum151);
        setElement(term54406, 22, enum152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term54406));
    }

};


