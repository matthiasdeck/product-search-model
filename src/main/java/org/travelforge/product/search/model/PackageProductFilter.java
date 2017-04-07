/*
* The Travelforge Project
* http://www.travelforge.org
*
* Copyright (c) 2015 - 2017 Matthias Deck
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to
* deal in the Software without restriction, including without limitation the
* rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
* sell copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
*
*/
package org.travelforge.product.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import static org.travelforge.product.search.model.PackageProductFilter.Parameter.*;

/**
 * @author Matthias Deck
 */
@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonIgnoreProperties(ignoreUnknown = false)
public class PackageProductFilter implements Serializable {

    private static final long serialVersionUID = 1L;

    public enum Parameter {

        PRODUCT_GROUPS,
        TOUR_OPERATOR_CODES,
        TRAVELLERS_ADULTS,
        TRAVELLERS_CHILDREN_AGE,
        TRAVELLERS_CHILDREN_DATE_OF_BIRTH,
        TRAVEL_PERIOD_DEPARTURE_DATE,
        TRAVEL_PERIOD_DEPARTURE_DATE_OFFSET,
        TRAVEL_PERIOD_DEPARTURE_DATE_PRE_OFFSET,
        TRAVEL_PERIOD_DEPARTURE_DATE_POST_OFFSET,
        TRAVEL_PERIOD_DEPARTURE_DAYS,
        TRAVEL_PERIOD_DEPARTURE_TIME_MIN,
        TRAVEL_PERIOD_DEPARTURE_TIME_MAX,
        TRAVEL_PERIOD_RETURN_DATE,
        TRAVEL_PERIOD_RETURN_DATE_OFFSET,
        TRAVEL_PERIOD_RETURN_DATE_PRE_OFFSET,
        TRAVEL_PERIOD_RETURN_DATE_POST_OFFSET,
        TRAVEL_PERIOD_RETURN_DAYS,
        TRAVEL_PERIOD_RETURN_TIME_MIN,
        TRAVEL_PERIOD_RETURN_TIME_MAX,
        TRAVEL_PERIOD_DURATIONS,
        FLIGHT_DEPARTURE_AIRPORT_CODES,
        FLIGHT_ARRIVAL_AIRPORT_CODES,
        FLIGHT_AIRLINE_CODES,
        FLIGHT_STOP_OVER_MAX,
        HOTEL_CODES,
        HOTEL_PRODUCT_CODES,
        HOTEL_CATEGORY,
        HOTEL_LOCATION_COUNTRY_CODES,
        HOTEL_LOCATION_REGION_CODES,
        HOTEL_LOCATION_CITY_CODES,
        HOTEL_ATTRIBUTES,
        HOTEL_RATING_COUNT,
        HOTEL_RATING_OVERALL,
        HOTEL_RATING_TOTAL,
        HOTEL_RATING_HOTEL,
        HOTEL_RATING_LOCATION,
        HOTEL_RATING_SERVICE,
        HOTEL_RATING_CATERING,
        HOTEL_RATING_SPORT,
        HOTEL_RATING_ROOM,
        HOTEL_RECOMMENDATIONS_TOTAL,
        HOTEL_RECOMMENDATIONS_SINGLE,
        HOTEL_RECOMMENDATIONS_FAMILY,
        HOTEL_RECOMMENDATIONS_COUPLES,
        HOTEL_RECOMMENDATIONS_FRIENDS,
        HOTEL_RECOMMENDATIONS_BEACH_HOLIDAY,
        HOTEL_RECOMMENDATIONS_BUSINESS_TRIP,
        HOTEL_RECOMMENDATIONS_CITY_BREAK,
        HOTEL_RECOMMENDATIONS_WELLNESS,
        HOTEL_ROOM_CODES,
        HOTEL_ROOM_BOOKING_CODES,
        HOTEL_ROOM_VIEW_CODES,
        HOTEL_ROOM_ATTRIBUTES,
        HOTEL_BOARD_CODES,
        EXTRAS,
        PRICE_MIN,
        PRICE_MAX
    }

    protected final Map<Parameter, Object> parameters = new TreeMap<>();

    // PRODUCT_GROUPS

    @SuppressWarnings("unchecked")
    public boolean hasProductGroups() {
        return parameters.get(PRODUCT_GROUPS) != null
                && !((List<Integer>) parameters.get(PRODUCT_GROUPS)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<Integer> getProductGroups() {
        return (List<Integer>) parameters.get(PRODUCT_GROUPS);
    }

    @JsonSetter("PRODUCT_GROUPS")
    public void setProductGroups(List<Integer> productGroups) {
        parameters.put(PRODUCT_GROUPS, productGroups);
    }

    // TOUR_OPERATOR_CODES

    @SuppressWarnings("unchecked")
    public boolean hasTourOperatorCodes() {
        return parameters.get(TOUR_OPERATOR_CODES) != null
                && !((List<String>) parameters.get(TOUR_OPERATOR_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getTourOperatorCodes() {
        return (List<String>) parameters.get(TOUR_OPERATOR_CODES);
    }

    @JsonSetter("TOUR_OPERATOR_CODES")
    public void setTourOperatorCodes(List<String> tourOperatorCodes) {
        parameters.put(TOUR_OPERATOR_CODES, tourOperatorCodes);
    }

    // TRAVELLERS_ADULTS

    @SuppressWarnings("unchecked")
    public boolean hasTravellersAdults() {
        return parameters.get(TRAVELLERS_ADULTS) != null;
    }

    @SuppressWarnings("unchecked")
    public Integer getTravellersAdults() {
        return (Integer) parameters.get(TRAVELLERS_ADULTS);
    }

    @JsonSetter("TRAVELLERS_ADULTS")
    public void setTravellersAdults(Integer adults) {
        parameters.put(TRAVELLERS_ADULTS, adults);
    }

    // TRAVELLERS_CHILDREN_AGE

    @SuppressWarnings("unchecked")
    public boolean hasTravellersChildrenAge() {
        return parameters.get(TRAVELLERS_CHILDREN_AGE) != null
                && !((List<Integer>) parameters.get(TRAVELLERS_CHILDREN_AGE)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<Integer> getTravellersChildrenAge() {
        return (List<Integer>) parameters.get(TRAVELLERS_CHILDREN_AGE);
    }

    @JsonSetter("TRAVELLERS_CHILDREN_AGE")
    public void setTravellersChildrenAge(List<Integer> travellersChildrenAge) {
        parameters.put(TRAVELLERS_CHILDREN_AGE, travellersChildrenAge);
    }

    // TRAVELLERS_CHILDREN_DATE_OF_BIRTH

    @SuppressWarnings("unchecked")
    public boolean hasTravellersChildrenDateOfBirth() {
        return parameters.get(TRAVELLERS_CHILDREN_DATE_OF_BIRTH) != null
                && !((List<LocalDate>) parameters.get(TRAVELLERS_CHILDREN_DATE_OF_BIRTH)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<LocalDate> getTravellersChildrenDateOfBirth() {
        return (List<LocalDate>) parameters.get(TRAVELLERS_CHILDREN_DATE_OF_BIRTH);
    }

    @JsonSetter("TRAVELLERS_CHILDREN_DATE_OF_BIRTH")
    public void setTravellersChildrenDateOfBirth(List<LocalDate> travellersChildrenDateOfBirth) {
        parameters.put(TRAVELLERS_CHILDREN_DATE_OF_BIRTH, travellersChildrenDateOfBirth);
    }

    // TRAVEL_PERIOD_DEPARTURE_DATE

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodDepartureDate() {
        return parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE) != null;
    }

    @SuppressWarnings("unchecked")
    public LocalDate getTravelPeriodDepartureDate() {
        return (LocalDate) parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE);
    }

    @JsonSetter("TRAVEL_PERIOD_DEPARTURE_DATE")
    public void setTravelPeriodDepartureDate(LocalDate travelPeriodDepartureDate) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DATE, travelPeriodDepartureDate);
    }

    // TRAVEL_PERIOD_DEPARTURE_DATE_OFFSET

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodDepartureDateOffset() {
        return parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE_OFFSET) != null;
    }

    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodDepartureDateOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE_OFFSET);
    }

    @JsonSetter("TRAVEL_PERIOD_DEPARTURE_DATE_OFFSET")
    public void setTravelPeriodDepartureDateOffset(Integer travelPeriodDepartureDateOffset) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DATE_OFFSET, travelPeriodDepartureDateOffset);
    }

    // TRAVEL_PERIOD_DEPARTURE_DATE_PRE_OFFSET

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodDepartureDatePreOffset() {
        return parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE_PRE_OFFSET) != null;
    }

    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodDepartureDatePreOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE_PRE_OFFSET);
    }

    @JsonSetter("TRAVEL_PERIOD_DEPARTURE_DATE_PRE_OFFSET")
    public void setTravelPeriodDepartureDatePreOffset(Integer travelPeriodDepartureDatePreOffset) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DATE_PRE_OFFSET, travelPeriodDepartureDatePreOffset);
    }

    // TRAVEL_PERIOD_DEPARTURE_DATE_POST_OFFSET

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodDepartureDatePostOffset() {
        return parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE_POST_OFFSET) != null;
    }

    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodDepartureDatePostOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE_POST_OFFSET);
    }

    @JsonSetter("TRAVEL_PERIOD_DEPARTURE_DATE_POST_OFFSET")
    public void setTravelPeriodDepartureDatePostOffset(Integer travelPeriodDepartureDatePostOffset) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DATE_POST_OFFSET, travelPeriodDepartureDatePostOffset);
    }

    // TRAVEL_PERIOD_DEPARTURE_DAYS

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodDepartureDays() {
        return parameters.get(TRAVEL_PERIOD_DEPARTURE_DAYS) != null
                && !((List<DayOfWeek>) parameters.get(TRAVEL_PERIOD_DEPARTURE_DAYS)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<DayOfWeek> getTravelPeriodDepartureDays() {
        return (List<DayOfWeek>) parameters.get(TRAVEL_PERIOD_DEPARTURE_DAYS);
    }

    @JsonSetter("TRAVEL_PERIOD_DEPARTURE_DAYS")
    public void setTravelPeriodDepartureDays(List<DayOfWeek> travelPeriodDepartureDays) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DAYS, travelPeriodDepartureDays);
    }

    // TRAVEL_PERIOD_DEPARTURE_TIME_MIN

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodDepartureTimeMin() {
        return parameters.get(TRAVEL_PERIOD_DEPARTURE_TIME_MIN) != null;
    }

    @SuppressWarnings("unchecked")
    public LocalTime getTravelPeriodDepartureTimeMin() {
        return (LocalTime) parameters.get(TRAVEL_PERIOD_DEPARTURE_TIME_MIN);
    }

    @JsonSetter("TRAVEL_PERIOD_DEPARTURE_TIME_MIN")
    public void setTravelPeriodDepartureTimeMin(LocalTime travelPeriodDepartureTimeMin) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_TIME_MIN, travelPeriodDepartureTimeMin);
    }

    // TRAVEL_PERIOD_DEPARTURE_TIME_MAX

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodDepartureTimeMax() {
        return parameters.get(TRAVEL_PERIOD_DEPARTURE_TIME_MAX) != null;
    }

    @SuppressWarnings("unchecked")
    public LocalTime getTravelPeriodDepartureTimeMax() {
        return (LocalTime) parameters.get(TRAVEL_PERIOD_DEPARTURE_TIME_MAX);
    }

    @JsonSetter("TRAVEL_PERIOD_DEPARTURE_TIME_MAX")
    public void setTravelPeriodDepartureTimeMax(LocalTime travelPeriodDepartureTimeMax) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_TIME_MAX, travelPeriodDepartureTimeMax);
    }

    // TRAVEL_PERIOD_RETURN_DATE

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodReturnDate() {
        return parameters.get(TRAVEL_PERIOD_RETURN_DATE) != null;
    }

    @SuppressWarnings("unchecked")
    public LocalDate getTravelPeriodReturnDate() {
        return (LocalDate) parameters.get(TRAVEL_PERIOD_RETURN_DATE);
    }

    @JsonSetter("TRAVEL_PERIOD_RETURN_DATE")
    public void setTravelPeriodReturnDate(LocalDate travelPeriodReturnDate) {
        parameters.put(TRAVEL_PERIOD_RETURN_DATE, travelPeriodReturnDate);
    }

    // TRAVEL_PERIOD_RETURN_DATE_OFFSET

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodReturnDateOffset() {
        return parameters.get(TRAVEL_PERIOD_RETURN_DATE_OFFSET) != null;
    }

    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodReturnDateOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_RETURN_DATE_OFFSET);
    }

    @JsonSetter("TRAVEL_PERIOD_RETURN_DATE_OFFSET")
    public void setTravelPeriodReturnDateOffset(Integer travelPeriodReturnDateOffset) {
        parameters.put(TRAVEL_PERIOD_RETURN_DATE_OFFSET, travelPeriodReturnDateOffset);
    }

    // TRAVEL_PERIOD_RETURN_DATE_PRE_OFFSET

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodReturnDatePreOffset() {
        return parameters.get(TRAVEL_PERIOD_RETURN_DATE_PRE_OFFSET) != null;
    }

    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodReturnDatePreOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_RETURN_DATE_PRE_OFFSET);
    }

    @JsonSetter("TRAVEL_PERIOD_RETURN_DATE_PRE_OFFSET")
    public void setTravelPeriodReturnDatePreOffset(Integer travelPeriodReturnDatePreOffset) {
        parameters.put(TRAVEL_PERIOD_RETURN_DATE_PRE_OFFSET, travelPeriodReturnDatePreOffset);
    }

    // TRAVEL_PERIOD_RETURN_DATE_POST_OFFSET

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodReturnDatePostOffset() {
        return parameters.get(TRAVEL_PERIOD_RETURN_DATE_POST_OFFSET) != null;
    }

    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodReturnDatePostOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_RETURN_DATE_POST_OFFSET);
    }

    @JsonSetter("TRAVEL_PERIOD_RETURN_DATE_POST_OFFSET")
    public void setTravelPeriodReturnDatePostOffset(Integer travelPeriodReturnDatePostOffset) {
        parameters.put(TRAVEL_PERIOD_RETURN_DATE_POST_OFFSET, travelPeriodReturnDatePostOffset);
    }

    // TRAVEL_PERIOD_RETURN_DAYS

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodReturnDays() {
        return parameters.get(TRAVEL_PERIOD_RETURN_DAYS) != null
                && !((List<DayOfWeek>) parameters.get(TRAVEL_PERIOD_RETURN_DAYS)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<DayOfWeek> getTravelPeriodReturnDays() {
        return (List<DayOfWeek>) parameters.get(TRAVEL_PERIOD_RETURN_DAYS);
    }

    @JsonSetter("TRAVEL_PERIOD_RETURN_DAYS")
    public void setTravelPeriodReturnDays(List<DayOfWeek> travelPeriodReturnDays) {
        parameters.put(TRAVEL_PERIOD_RETURN_DAYS, travelPeriodReturnDays);
    }

    // TRAVEL_PERIOD_RETURN_TIME_MIN

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodReturnTimeMin() {
        return parameters.get(TRAVEL_PERIOD_RETURN_TIME_MIN) != null;
    }

    @SuppressWarnings("unchecked")
    public LocalTime getTravelPeriodReturnTimeMin() {
        return (LocalTime) parameters.get(TRAVEL_PERIOD_RETURN_TIME_MIN);
    }

    @JsonSetter("TRAVEL_PERIOD_RETURN_TIME_MIN")
    public void setTravelPeriodReturnTimeMin(LocalTime travelPeriodReturnTimeMin) {
        parameters.put(TRAVEL_PERIOD_RETURN_TIME_MIN, travelPeriodReturnTimeMin);
    }

    // TRAVEL_PERIOD_RETURN_TIME_MAX

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodReturnTimeMax() {
        return parameters.get(TRAVEL_PERIOD_RETURN_TIME_MAX) != null;
    }

    @SuppressWarnings("unchecked")
    public LocalTime getTravelPeriodReturnTimeMax() {
        return (LocalTime) parameters.get(TRAVEL_PERIOD_RETURN_TIME_MAX);
    }

    @JsonSetter("TRAVEL_PERIOD_RETURN_TIME_MAX")
    public void setTravelPeriodReturnTimeMax(LocalTime travelPeriodReturnTimeMax) {
        parameters.put(TRAVEL_PERIOD_RETURN_TIME_MAX, travelPeriodReturnTimeMax);
    }

    // TRAVEL_PERIOD_DURATIONS

    @SuppressWarnings("unchecked")
    public boolean hasTravelPeriodDurations() {
        return parameters.get(TRAVEL_PERIOD_DURATIONS) != null
                && !((List<Integer>) parameters.get(TRAVEL_PERIOD_DURATIONS)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<Integer> getTravelPeriodDurations() {
        return (List<Integer>) parameters.get(TRAVEL_PERIOD_DURATIONS);
    }

    @JsonSetter("TRAVEL_PERIOD_DURATIONS")
    public void setTravelPeriodDurations(List<Integer> travelPeriodDurations) {
        parameters.put(TRAVEL_PERIOD_DURATIONS, travelPeriodDurations);
    }

    // FLIGHT_DEPARTURE_AIRPORT_CODES

    @SuppressWarnings("unchecked")
    public boolean hasFlightDepartureAirportCodes() {
        return parameters.get(FLIGHT_DEPARTURE_AIRPORT_CODES) != null
                && !((List<String>) parameters.get(FLIGHT_DEPARTURE_AIRPORT_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getFlightDepartureAirportCodes() {
        return (List<String>) parameters.get(FLIGHT_DEPARTURE_AIRPORT_CODES);
    }

    @JsonSetter("FLIGHT_DEPARTURE_AIRPORT_CODES")
    public void setFlightDepartureAirportCodes(List<String> flightDepartureAirportCodes) {
        parameters.put(FLIGHT_DEPARTURE_AIRPORT_CODES, flightDepartureAirportCodes);
    }

    // FLIGHT_ARRIVAL_AIRPORT_CODES

    @SuppressWarnings("unchecked")
    public boolean hasFlightArrivalAirportCodes() {
        return parameters.get(FLIGHT_ARRIVAL_AIRPORT_CODES) != null
                && !((List<String>) parameters.get(FLIGHT_ARRIVAL_AIRPORT_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getFlightArrivalAirportCodes() {
        return (List<String>) parameters.get(FLIGHT_ARRIVAL_AIRPORT_CODES);
    }

    @JsonSetter("FLIGHT_ARRIVAL_AIRPORT_CODES")
    public void setFlightArrivalAirportCodes(List<String> flightArrivalAirportCodes) {
        parameters.put(FLIGHT_ARRIVAL_AIRPORT_CODES, flightArrivalAirportCodes);
    }

    // FLIGHT_AIRLINE_CODES

    @SuppressWarnings("unchecked")
    public boolean hasFlightAirlineCodes() {
        return parameters.get(FLIGHT_AIRLINE_CODES) != null
                && !((List<String>) parameters.get(FLIGHT_AIRLINE_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getFlightAirlineCodes() {
        return (List<String>) parameters.get(FLIGHT_AIRLINE_CODES);
    }

    @JsonSetter("FLIGHT_AIRLINE_CODES")
    public void setFlightAirlineCodes(List<String> flightAirlineCodes) {
        parameters.put(FLIGHT_AIRLINE_CODES, flightAirlineCodes);
    }

    // FLIGHT_STOP_OVER_MAX

    @SuppressWarnings("unchecked")
    public boolean hasFlightStopOverMax() {
        return parameters.get(FLIGHT_STOP_OVER_MAX) != null;
    }

    @SuppressWarnings("unchecked")
    public Integer getFlightStopOverMax() {
        return (Integer) parameters.get(FLIGHT_STOP_OVER_MAX);
    }

    @JsonSetter("FLIGHT_STOP_OVER_MAX")
    public void setFlightStopOverMax(Integer flightStopOverMax) {
        parameters.put(FLIGHT_STOP_OVER_MAX, flightStopOverMax);
    }

    // HOTEL_CODES

    @SuppressWarnings("unchecked")
    public boolean hasHotelCodes() {
        return parameters.get(HOTEL_CODES) != null
                && !((List<Integer>) parameters.get(HOTEL_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<Integer> getHotelCodes() {
        return (List<Integer>) parameters.get(HOTEL_CODES);
    }

    @JsonSetter("HOTEL_CODES")
    public void setHotelCodes(List<Integer> hotelCodes) {
        parameters.put(HOTEL_CODES, hotelCodes);
    }

    // HOTEL_PRODUCT_CODES

    @SuppressWarnings("unchecked")
    public boolean hasHotelProductCodes() {
        return parameters.get(HOTEL_PRODUCT_CODES) != null
                && !((List<String>) parameters.get(HOTEL_PRODUCT_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getHotelProductCodes() {
        return (List<String>) parameters.get(HOTEL_PRODUCT_CODES);
    }

    @JsonSetter("HOTEL_PRODUCT_CODES")
    public void setHotelProductCodes(List<String> hotelProductCodes) {
        parameters.put(HOTEL_PRODUCT_CODES, hotelProductCodes);
    }

    // HOTEL_CATEGORY

    @SuppressWarnings("unchecked")
    public boolean hasHotelCategory() {
        return parameters.get(HOTEL_CATEGORY) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelCategory() {
        return (Float) parameters.get(HOTEL_CATEGORY);
    }

    @JsonSetter("HOTEL_CATEGORY")
    public void setHotelCategory(Float hotelCategory) {
        parameters.put(HOTEL_CATEGORY, hotelCategory);
    }

    // HOTEL_LOCATION_COUNTRY_CODES

    @SuppressWarnings("unchecked")
    public boolean hasHotelLocationCountryCodes() {
        return parameters.get(HOTEL_LOCATION_COUNTRY_CODES) != null
                && !((List<String>) parameters.get(HOTEL_LOCATION_COUNTRY_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getHotelLocationCountryCodes() {
        return (List<String>) parameters.get(HOTEL_LOCATION_COUNTRY_CODES);
    }

    @JsonSetter("HOTEL_LOCATION_COUNTRY_CODES")
    public void setHotelLocationCountryCodes(List<String> hotelLocationCountryCodes) {
        parameters.put(HOTEL_LOCATION_COUNTRY_CODES, hotelLocationCountryCodes);
    }

    // HOTEL_LOCATION_REGION_CODES

    @SuppressWarnings("unchecked")
    public boolean hasHotelLocationRegionCodes() {
        return parameters.get(HOTEL_LOCATION_REGION_CODES) != null
                && !((List<Integer>) parameters.get(HOTEL_LOCATION_REGION_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<Integer> getHotelLocationRegionCodes() {
        return (List<Integer>) parameters.get(HOTEL_LOCATION_REGION_CODES);
    }

    @JsonSetter("HOTEL_LOCATION_REGION_CODES")
    public void setHotelLocationRegionCodes(List<Integer> hotelLocationRegionCodes) {
        parameters.put(HOTEL_LOCATION_REGION_CODES, hotelLocationRegionCodes);
    }

    // HOTEL_LOCATION_CITY_CODES

    @SuppressWarnings("unchecked")
    public boolean hasHotelLocationCityCodes() {
        return parameters.get(HOTEL_LOCATION_CITY_CODES) != null
                && !((List<Integer>) parameters.get(HOTEL_LOCATION_CITY_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<Integer> getHotelLocationCityCodes() {
        return (List<Integer>) parameters.get(HOTEL_LOCATION_CITY_CODES);
    }

    @JsonSetter("HOTEL_LOCATION_CITY_CODES")
    public void setHotelLocationCityCodes(List<Integer> hotelLocationCityCodes) {
        parameters.put(HOTEL_LOCATION_CITY_CODES, hotelLocationCityCodes);
    }

    // HOTEL_ATTRIBUTES

    @SuppressWarnings("unchecked")
    public boolean hasHotelAttributes() {
        return parameters.get(HOTEL_ATTRIBUTES) != null
                && !((List<String>) parameters.get(HOTEL_ATTRIBUTES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getHotelAttributes() {
        return (List<String>) parameters.get(HOTEL_ATTRIBUTES);
    }

    @JsonSetter("HOTEL_ATTRIBUTES")
    public void setHotelAttributes(List<String> hotelAttributes) {
        parameters.put(HOTEL_ATTRIBUTES, hotelAttributes);
    }

    // HOTEL_RATING_COUNT

    @SuppressWarnings("unchecked")
    public boolean hasHotelRatingCount() {
        return parameters.get(HOTEL_RATING_COUNT) != null;
    }

    @SuppressWarnings("unchecked")
    public Integer getHotelRatingCount() {
        return (Integer) parameters.get(HOTEL_RATING_COUNT);
    }

    @JsonSetter("HOTEL_RATING_COUNT")
    public void setHotelRatingCount(Integer hotelRatingCount) {
        parameters.put(HOTEL_RATING_COUNT, hotelRatingCount);
    }

    // HOTEL_RATING_OVERALL

    @SuppressWarnings("unchecked")
    public boolean hasHotelRatingOverAll() {
        return parameters.get(HOTEL_RATING_OVERALL) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRatingOverAll() {
        return (Float) parameters.get(HOTEL_RATING_OVERALL);
    }

    @JsonSetter("HOTEL_RATING_OVERALL")
    public void setHotelRatingOverAll(Float hotelRatingOverAll) {
        parameters.put(HOTEL_RATING_OVERALL, hotelRatingOverAll);
    }

    // HOTEL_RATING_TOTAL

    @SuppressWarnings("unchecked")
    public boolean hasHotelRatingTotal() {
        return parameters.get(HOTEL_RATING_TOTAL) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRatingTotal() {
        return (Float) parameters.get(HOTEL_RATING_TOTAL);
    }

    @JsonSetter("HOTEL_RATING_TOTAL")
    public void setHotelRatingTotal(Float hotelRatingTotal) {
        parameters.put(HOTEL_RATING_TOTAL, hotelRatingTotal);
    }

    // HOTEL_RATING_HOTEL

    @SuppressWarnings("unchecked")
    public boolean hasHotelRatingHotel() {
        return parameters.get(HOTEL_RATING_HOTEL) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRatingHotel() {
        return (Float) parameters.get(HOTEL_RATING_HOTEL);
    }

    @JsonSetter("HOTEL_RATING_HOTEL")
    public void setHotelRatingHotel(Float hotelRatingHotel) {
        parameters.put(HOTEL_RATING_HOTEL, hotelRatingHotel);
    }

    // HOTEL_RATING_LOCATION

    @SuppressWarnings("unchecked")
    public boolean hasHotelRatingLocation() {
        return parameters.get(HOTEL_RATING_LOCATION) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRatingLocation() {
        return (Float) parameters.get(HOTEL_RATING_LOCATION);
    }

    @JsonSetter("HOTEL_RATING_LOCATION")
    public void setHotelRatingLocation(Float hotelRatingLocation) {
        parameters.put(HOTEL_RATING_LOCATION, hotelRatingLocation);
    }

    // HOTEL_RATING_SERVICE

    @SuppressWarnings("unchecked")
    public boolean hasHotelRatingService() {
        return parameters.get(HOTEL_RATING_SERVICE) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRatingService() {
        return (Float) parameters.get(HOTEL_RATING_SERVICE);
    }

    @JsonSetter("HOTEL_RATING_SERVICE")
    public void setHotelRatingService(Float hotelRatingService) {
        parameters.put(HOTEL_RATING_SERVICE, hotelRatingService);
    }

    // HOTEL_RATING_CATERING

    @SuppressWarnings("unchecked")
    public boolean hasHotelRatingCatering() {
        return parameters.get(HOTEL_RATING_CATERING) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRatingCatering() {
        return (Float) parameters.get(HOTEL_RATING_CATERING);
    }

    @JsonSetter("HOTEL_RATING_CATERING")
    public void setHotelRatingCatering(Float hotelRatingCatering) {
        parameters.put(HOTEL_RATING_CATERING, hotelRatingCatering);
    }

    // HOTEL_RATING_SPORT

    @SuppressWarnings("unchecked")
    public boolean hasHotelRatingSport() {
        return parameters.get(HOTEL_RATING_SPORT) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRatingSport() {
        return (Float) parameters.get(HOTEL_RATING_SPORT);
    }

    @JsonSetter("HOTEL_RATING_SPORT")
    public void setHotelRatingSport(Float hotelRatingSport) {
        parameters.put(HOTEL_RATING_SPORT, hotelRatingSport);
    }

    // HOTEL_RATING_ROOM

    @SuppressWarnings("unchecked")
    public boolean hasHotelRatingRoom() {
        return parameters.get(HOTEL_RATING_ROOM) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRatingRoom() {
        return (Float) parameters.get(HOTEL_RATING_ROOM);
    }

    @JsonSetter("HOTEL_RATING_ROOM")
    public void setHotelRatingRoom(Float hotelRatingRoom) {
        parameters.put(HOTEL_RATING_ROOM, hotelRatingRoom);
    }

    // HOTEL_RECOMMENDATIONS_TOTAL

    @SuppressWarnings("unchecked")
    public boolean hasHotelRecommendationsTotal() {
        return parameters.get(HOTEL_RECOMMENDATIONS_TOTAL) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsTotal() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_TOTAL);
    }

    @JsonSetter("HOTEL_RECOMMENDATIONS_TOTAL")
    public void setHotelRecommendationsTotal(Float hotelRecommendationsTotal) {
        parameters.put(HOTEL_RECOMMENDATIONS_TOTAL, hotelRecommendationsTotal);
    }

    // HOTEL_RECOMMENDATIONS_SINGLE

    @SuppressWarnings("unchecked")
    public boolean hasHotelRecommendationsSingle() {
        return parameters.get(HOTEL_RECOMMENDATIONS_SINGLE) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsSingle() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_SINGLE);
    }

    @JsonSetter("HOTEL_RECOMMENDATIONS_SINGLE")
    public void setHotelRecommendationsSingle(Float hotelRecommendationsSingle) {
        parameters.put(HOTEL_RECOMMENDATIONS_SINGLE, hotelRecommendationsSingle);
    }

    // HOTEL_RECOMMENDATIONS_FAMILY

    @SuppressWarnings("unchecked")
    public boolean hasHotelRecommendationsFamily() {
        return parameters.get(HOTEL_RECOMMENDATIONS_FAMILY) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsFamily() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_FAMILY);
    }

    @JsonSetter("HOTEL_RECOMMENDATIONS_FAMILY")
    public void setHotelRecommendationsFamily(Float hotelRecommendationsFamily) {
        parameters.put(HOTEL_RECOMMENDATIONS_FAMILY, hotelRecommendationsFamily);
    }

    // HOTEL_RECOMMENDATIONS_COUPLES

    @SuppressWarnings("unchecked")
    public boolean hasHotelRecommendationsCouples() {
        return parameters.get(HOTEL_RECOMMENDATIONS_COUPLES) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsCouples() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_COUPLES);
    }

    @JsonSetter("HOTEL_RECOMMENDATIONS_COUPLES")
    public void setHotelRecommendationsCouples(Float hotelRecommendationsCouples) {
        parameters.put(HOTEL_RECOMMENDATIONS_COUPLES, hotelRecommendationsCouples);
    }

    // HOTEL_RECOMMENDATIONS_FRIENDS

    @SuppressWarnings("unchecked")
    public boolean hasHotelRecommendationsFriends() {
        return parameters.get(HOTEL_RECOMMENDATIONS_FRIENDS) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsFriends() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_FRIENDS);
    }

    @JsonSetter("HOTEL_RECOMMENDATIONS_FRIENDS")
    public void setHotelRecommendationsFriends(Float hotelRecommendationsFriends) {
        parameters.put(HOTEL_RECOMMENDATIONS_FRIENDS, hotelRecommendationsFriends);
    }

    // HOTEL_RECOMMENDATIONS_BEACH_HOLIDAY

    @SuppressWarnings("unchecked")
    public boolean hasHotelRecommendationsBeachHoliday() {
        return parameters.get(HOTEL_RECOMMENDATIONS_BEACH_HOLIDAY) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsBeachHoliday() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_BEACH_HOLIDAY);
    }

    @JsonSetter("HOTEL_RECOMMENDATIONS_BEACH_HOLIDAY")
    public void setHotelRecommendationsBeachHoliday(Float hotelRecommendationsBeachHoliday) {
        parameters.put(HOTEL_RECOMMENDATIONS_BEACH_HOLIDAY, hotelRecommendationsBeachHoliday);
    }

    // HOTEL_RECOMMENDATIONS_BUSINESS_TRIP

    @SuppressWarnings("unchecked")
    public boolean hasHotelRecommendationsBusinessTrip() {
        return parameters.get(HOTEL_RECOMMENDATIONS_BUSINESS_TRIP) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsBusinessTrip() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_BUSINESS_TRIP);
    }

    @JsonSetter("HOTEL_RECOMMENDATIONS_BUSINESS_TRIP")
    public void setHotelRecommendationsBusinessTrip(Float hotelRecommendationsBusinessTrip) {
        parameters.put(HOTEL_RECOMMENDATIONS_BUSINESS_TRIP, hotelRecommendationsBusinessTrip);
    }

    // HOTEL_RECOMMENDATIONS_CITY_BREAK

    @SuppressWarnings("unchecked")
    public boolean hasHotelRecommendationsCityBreak() {
        return parameters.get(HOTEL_RECOMMENDATIONS_CITY_BREAK) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsCityBreak() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_CITY_BREAK);
    }

    @JsonSetter("HOTEL_RECOMMENDATIONS_CITY_BREAK")
    public void setHotelRecommendationsCityBreak(Float hotelRecommendationsCityBreak) {
        parameters.put(HOTEL_RECOMMENDATIONS_CITY_BREAK, hotelRecommendationsCityBreak);
    }

    // HOTEL_RECOMMENDATIONS_WELLNESS

    @SuppressWarnings("unchecked")
    public boolean hasHotelRecommendationsWellness() {
        return parameters.get(HOTEL_RECOMMENDATIONS_WELLNESS) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsWellness() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_WELLNESS);
    }

    @JsonSetter("HOTEL_RECOMMENDATIONS_WELLNESS")
    public void setHotelRecommendationsWellness(Float hotelRecommendationsWellness) {
        parameters.put(HOTEL_RECOMMENDATIONS_WELLNESS, hotelRecommendationsWellness);
    }

    // HOTEL_ROOM_CODES

    @SuppressWarnings("unchecked")
    public boolean hasHotelRoomCodes() {
        return parameters.get(HOTEL_ROOM_CODES) != null
                && !((List<String>) parameters.get(HOTEL_ROOM_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getHotelRoomCodes() {
        return (List<String>) parameters.get(HOTEL_ROOM_CODES);
    }

    @JsonSetter("HOTEL_ROOM_CODES")
    public void setHotelRoomCodes(List<String> hotelRoomCodes) {
        parameters.put(HOTEL_ROOM_CODES, hotelRoomCodes);
    }

    // HOTEL_ROOM_BOOKING_CODES

    @SuppressWarnings("unchecked")
    public boolean hasHotelRoomBookingCodes() {
        return parameters.get(HOTEL_ROOM_BOOKING_CODES) != null
                && !((List<String>) parameters.get(HOTEL_ROOM_BOOKING_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getHotelRoomBookingCodes() {
        return (List<String>) parameters.get(HOTEL_ROOM_BOOKING_CODES);
    }

    @JsonSetter("HOTEL_ROOM_BOOKING_CODES")
    public void setHotelRoomBookingCodes(List<String> hotelRoomBookingCodes) {
        parameters.put(HOTEL_ROOM_BOOKING_CODES, hotelRoomBookingCodes);
    }

    // HOTEL_ROOM_VIEW_CODES

    @SuppressWarnings("unchecked")
    public boolean hasHotelRoomViewCodes() {
        return parameters.get(HOTEL_ROOM_VIEW_CODES) != null
                && !((List<String>) parameters.get(HOTEL_ROOM_VIEW_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getHotelRoomViewCodes() {
        return (List<String>) parameters.get(HOTEL_ROOM_VIEW_CODES);
    }

    @JsonSetter("HOTEL_ROOM_VIEW_CODES")
    public void setHotelRoomViewCodes(List<String> hotelRoomViewCodes) {
        parameters.put(HOTEL_ROOM_VIEW_CODES, hotelRoomViewCodes);
    }

    // HOTEL_ROOM_ATTRIBUTES

    @SuppressWarnings("unchecked")
    public boolean hasHotelRoomAttributes() {
        return parameters.get(HOTEL_ROOM_ATTRIBUTES) != null
                && !((List<String>) parameters.get(HOTEL_ROOM_ATTRIBUTES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getHotelRoomAttributes() {
        return (List<String>) parameters.get(HOTEL_ROOM_ATTRIBUTES);
    }

    @JsonSetter("HOTEL_ROOM_ATTRIBUTES")
    public void setHotelRoomAttributes(List<String> hotelRoomAttributes) {
        parameters.put(HOTEL_ROOM_ATTRIBUTES, hotelRoomAttributes);
    }

    // HOTEL_BOARD_CODES

    @SuppressWarnings("unchecked")
    public boolean hasHotelBoardCodes() {
        return parameters.get(HOTEL_BOARD_CODES) != null
                && !((List<String>) parameters.get(HOTEL_BOARD_CODES)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getHotelBoardCodes() {
        return (List<String>) parameters.get(HOTEL_BOARD_CODES);
    }

    @JsonSetter("HOTEL_BOARD_CODES")
    public void setHotelBoardCodes(List<String> hotelBoardCodes) {
        parameters.put(HOTEL_BOARD_CODES, hotelBoardCodes);
    }

    // EXTRAS

    @SuppressWarnings("unchecked")
    public boolean hasExtras() {
        return parameters.get(EXTRAS) != null
                && !((List<String>) parameters.get(EXTRAS)).isEmpty();
    }

    @SuppressWarnings("unchecked")
    public List<String> getExtras() {
        return (List<String>) parameters.get(EXTRAS);
    }

    @JsonSetter("EXTRAS")
    public void setExtras(List<String> extras) {
        parameters.put(EXTRAS, extras);
    }

    //PRICE_MIN

    @SuppressWarnings("unchecked")
    public boolean hasPriceMin() {
        return parameters.get(PRICE_MIN) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getPriceMin() {
        return (Float) parameters.get(PRICE_MIN);
    }

    @JsonSetter("PRICE_MIN")
    public void setPriceMin(Float priceMin) {
        parameters.put(PRICE_MIN, priceMin);
    }

    // PRICE_MAX

    @SuppressWarnings("unchecked")
    public boolean hasPriceMax() {
        return parameters.get(PRICE_MAX) != null;
    }

    @SuppressWarnings("unchecked")
    public Float getPriceMax() {
        return (Float) parameters.get(PRICE_MAX);
    }

    @JsonSetter("PRICE_MAX")
    public void setPriceMax(Float priceMax) {
        parameters.put(PRICE_MAX, priceMax);
    }

    public PackageProductFilter merge(PackageProductFilter other) {

        PackageProductFilter merged = new PackageProductFilter();

        for (Parameter parameter : Parameter.values()) {

            Object value = null;

            if (other.parameters.containsKey(parameter)) {
                value = other.parameters.get(parameter);
            } else if (this.parameters.containsKey(parameter)) {
                value = this.parameters.get(parameter);
            }

            if (value != null) {
                if (List.class.isAssignableFrom(value.getClass())) {
                    merged.parameters.put(parameter, new ArrayList<>((List) value));
                } else {
                    merged.parameters.put(parameter, value);
                }
            }
        }

        return merged;
    }

    @Override
    public PackageProductFilter clone() {

        PackageProductFilter clone = new PackageProductFilter();

        for (Parameter parameter : this.parameters.keySet()) {
            Object value = this.parameters.get(parameter);
            if (value != null && List.class.isAssignableFrom(value.getClass())) {
                clone.parameters.put(parameter, new ArrayList<>((List) value));
            } else {
                clone.parameters.put(parameter, value);
            }
        }

        return clone;
    }

    @JsonValue
    public Map<Parameter, Object> getParameters() {
        return Collections.unmodifiableMap(this.parameters);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageProductFilter query = (PackageProductFilter) o;
        return parameters.equals(query.parameters);
    }

    @Override
    public int hashCode() {
        return parameters.hashCode();
    }

    @Override
    public String toString() {
        return "PackageProductFilter{" + "parameters=" + parameters + "}";
    }
}
