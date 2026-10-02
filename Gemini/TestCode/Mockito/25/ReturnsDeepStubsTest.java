package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.util.reflection.GenericMetadataSupport;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReturnsDeepStubsTest {

    interface Person {
        Address getAddress();
        String getName();
        int getAge();
        boolean isActive();
        double getSalary();
        void doNothing();
    }

    interface Address {
        City getCity();
        String getStreet();
        int getZipCode();
    }

    interface City {
        String getCityName();
    }

    interface GenericContainer<T> {
        T getItem();
    }

    interface PersonContainer extends GenericContainer<Person> {
    }

    static class SubclassReturnsDeepStubs extends ReturnsDeepStubs {
        public GenericMetadataSupport exposeActualParameterizedType(Object mock) {
            return super.actualParameterizedType(mock);
        }
    }

    @Test
    public void testAnswer_mockableReturnType_returnsDeepMock() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = mock(Person.class, answer);

        Address address = person.getAddress();
        assertNotNull(address);

        City city = address.getCity();
        assertNotNull(city);
    }

    @Test
    public void testAnswer_unmockableReturnType_primitiveInt_returnsZero() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = mock(Person.class, answer);

        int age = person.getAge();
        assertEquals(0, age);
    }

    @Test
    public void testAnswer_unmockableReturnType_primitiveBoolean_returnsFalse() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = mock(Person.class, answer);

        boolean active = person.isActive();
        assertFalse(active);
    }

    @Test
    public void testAnswer_unmockableReturnType_primitiveDouble_returnsZero() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = mock(Person.class, answer);

        double salary = person.getSalary();
        assertEquals(0.0, salary, 0.0001);
    }

    @Test
    public void testAnswer_unmockableReturnType_finalClassString_returnsEmptyString() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = mock(Person.class, answer);

        String name = person.getName();
        assertEquals("", name);
    }

    @Test
    public void testAnswer_voidReturnType_returnsNull() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = mock(Person.class, answer);

        person.doNothing();
    }

    @Test
    public void testAnswer_consecutiveCalls_returnsSameMockInstance() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = mock(Person.class, answer);

        Address address1 = person.getAddress();
        Address address2 = person.getAddress();

        assertNotNull(address1);
        assertSame(address1, address2);
    }

    @Test
    public void testAnswer_withGenerics_resolvesCorrectType() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        PersonContainer container = mock(PersonContainer.class, answer);

        Person person = container.getItem();
        assertNotNull(person);
        assertEquals("", person.getName());
    }

    @Test
    public void testAnswer_customStubbing_overridesDeepStubbing() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = mock(Person.class, answer);

        when(person.getAddress().getStreet()).thenReturn("Main Street");
        when(person.getAddress().getZipCode()).thenReturn(12345);

        assertEquals("Main Street", person.getAddress().getStreet());
        assertEquals(12345, person.getAddress().getZipCode());
    }

    @Test
    public void testActualParameterizedType_validMock_returnsMetadata() {
        SubclassReturnsDeepStubs answer = new SubclassReturnsDeepStubs();
        Person person = mock(Person.class, answer);

        GenericMetadataSupport metadata = answer.exposeActualParameterizedType(person);
        assertNotNull(metadata);
        assertEquals(Person.class, metadata.rawType());
    }

    @Test(expected = NotAMockException.class)
    public void testActualParameterizedType_nonMockObject_throwsNotAMockException() {
        SubclassReturnsDeepStubs answer = new SubclassReturnsDeepStubs();
        answer.exposeActualParameterizedType(new Object());
    }

    @Test(expected = NotAMockException.class)
    public void testActualParameterizedType_nullObject_throwsNotAMockException() {
        SubclassReturnsDeepStubs answer = new SubclassReturnsDeepStubs();
        answer.exposeActualParameterizedType(null);
    }

    @Test
    public void testSerialization_serializesAndDeserializesCorrectly() throws Exception {
        ReturnsDeepStubs original = new ReturnsDeepStubs();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsDeepStubs);

        Person person = mock(Person.class, (ReturnsDeepStubs) deserialized);
        assertNotNull(person.getAddress());
    }

    @Test
    public void testAnswer_nestedListInterface_returnsEmptyListFromDelegate() {
        interface CollectionContainer {
            List<String> getList();
        }

        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        CollectionContainer container = mock(CollectionContainer.class, answer);

        List<String> list = container.getList();
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }
}
