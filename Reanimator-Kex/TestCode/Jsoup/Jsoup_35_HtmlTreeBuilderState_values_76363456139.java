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

public class HtmlTreeBuilderState_values_76363456139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54335;

    public HtmlTreeBuilderState_values_76363456139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54658 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54657 = ((Class) term54658).getDeclaredField((String) "Initial");
        ((Field) term54657).setAccessible(true);
        Object enum141 = ((Field) term54657).get((Object) null);
        Class<? extends Object> term54871 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term54870 = ((Class) term54871).getDeclaredField((String) "BeforeHtml");
        ((Field) term54870).setAccessible(true);
        Object enum142 = ((Field) term54870).get((Object) null);
        Class<? extends Object> term55093 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55092 = ((Class) term55093).getDeclaredField((String) "BeforeHead");
        ((Field) term55092).setAccessible(true);
        Object enum143 = ((Field) term55092).get((Object) null);
        Class<? extends Object> term55315 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55314 = ((Class) term55315).getDeclaredField((String) "InHead");
        ((Field) term55314).setAccessible(true);
        Object enum144 = ((Field) term55314).get((Object) null);
        Class<? extends Object> term55525 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55524 = ((Class) term55525).getDeclaredField((String) "InHeadNoscript");
        ((Field) term55524).setAccessible(true);
        Object enum145 = ((Field) term55524).get((Object) null);
        Class<? extends Object> term55759 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55758 = ((Class) term55759).getDeclaredField((String) "AfterHead");
        ((Field) term55758).setAccessible(true);
        Object enum146 = ((Field) term55758).get((Object) null);
        Class<? extends Object> term55978 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term55977 = ((Class) term55978).getDeclaredField((String) "InBody");
        ((Field) term55977).setAccessible(true);
        Object enum147 = ((Field) term55977).get((Object) null);
        Class<? extends Object> term56188 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56187 = ((Class) term56188).getDeclaredField((String) "Text");
        ((Field) term56187).setAccessible(true);
        Object enum148 = ((Field) term56187).get((Object) null);
        Class<? extends Object> term56392 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56391 = ((Class) term56392).getDeclaredField((String) "InTable");
        ((Field) term56391).setAccessible(true);
        Object enum149 = ((Field) term56391).get((Object) null);
        Class<? extends Object> term56605 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56604 = ((Class) term56605).getDeclaredField((String) "InTableText");
        ((Field) term56604).setAccessible(true);
        Object enum150 = ((Field) term56604).get((Object) null);
        Class<? extends Object> term56830 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term56829 = ((Class) term56830).getDeclaredField((String) "InCaption");
        ((Field) term56829).setAccessible(true);
        Object enum151 = ((Field) term56829).get((Object) null);
        Class<? extends Object> term57049 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57048 = ((Class) term57049).getDeclaredField((String) "InColumnGroup");
        ((Field) term57048).setAccessible(true);
        Object enum152 = ((Field) term57048).get((Object) null);
        Class<? extends Object> term57280 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57279 = ((Class) term57280).getDeclaredField((String) "InTableBody");
        ((Field) term57279).setAccessible(true);
        Object enum153 = ((Field) term57279).get((Object) null);
        Class<? extends Object> term57505 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57504 = ((Class) term57505).getDeclaredField((String) "InRow");
        ((Field) term57504).setAccessible(true);
        Object enum154 = ((Field) term57504).get((Object) null);
        Class<? extends Object> term57712 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57711 = ((Class) term57712).getDeclaredField((String) "InCell");
        ((Field) term57711).setAccessible(true);
        Object enum155 = ((Field) term57711).get((Object) null);
        Class<? extends Object> term57922 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term57921 = ((Class) term57922).getDeclaredField((String) "InSelect");
        ((Field) term57921).setAccessible(true);
        Object enum156 = ((Field) term57921).get((Object) null);
        Class<? extends Object> term58138 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58137 = ((Class) term58138).getDeclaredField((String) "InSelectInTable");
        ((Field) term58137).setAccessible(true);
        Object enum157 = ((Field) term58137).get((Object) null);
        Class<? extends Object> term58375 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58374 = ((Class) term58375).getDeclaredField((String) "AfterBody");
        ((Field) term58374).setAccessible(true);
        Object enum158 = ((Field) term58374).get((Object) null);
        Class<? extends Object> term58594 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58593 = ((Class) term58594).getDeclaredField((String) "InFrameset");
        ((Field) term58593).setAccessible(true);
        Object enum159 = ((Field) term58593).get((Object) null);
        Class<? extends Object> term58816 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term58815 = ((Class) term58816).getDeclaredField((String) "AfterFrameset");
        ((Field) term58815).setAccessible(true);
        Object enum160 = ((Field) term58815).get((Object) null);
        Class<? extends Object> term59047 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59046 = ((Class) term59047).getDeclaredField((String) "AfterAfterBody");
        ((Field) term59046).setAccessible(true);
        Object enum161 = ((Field) term59046).get((Object) null);
        Class<? extends Object> term59281 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59280 = ((Class) term59281).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term59280).setAccessible(true);
        Object enum162 = ((Field) term59280).get((Object) null);
        Class<? extends Object> term59528 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term59527 = ((Class) term59528).getDeclaredField((String) "ForeignContent");
        ((Field) term59527).setAccessible(true);
        Object enum163 = ((Field) term59527).get((Object) null);
        term54335 = (Object[]) newArray("org.jsoup.parser.HtmlTreeBuilderState", 23);
        setElement(term54335, 0, enum141);
        setElement(term54335, 1, enum142);
        setElement(term54335, 2, enum143);
        setElement(term54335, 3, enum144);
        setElement(term54335, 4, enum145);
        setElement(term54335, 5, enum146);
        setElement(term54335, 6, enum147);
        setElement(term54335, 7, enum148);
        setElement(term54335, 8, enum149);
        setElement(term54335, 9, enum150);
        setElement(term54335, 10, enum151);
        setElement(term54335, 11, enum152);
        setElement(term54335, 12, enum153);
        setElement(term54335, 13, enum154);
        setElement(term54335, 14, enum155);
        setElement(term54335, 15, enum156);
        setElement(term54335, 16, enum157);
        setElement(term54335, 17, enum158);
        setElement(term54335, 18, enum159);
        setElement(term54335, 19, enum160);
        setElement(term54335, 20, enum161);
        setElement(term54335, 21, enum162);
        setElement(term54335, 22, enum163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term54335));
    }

};


